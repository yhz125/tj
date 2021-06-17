/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.manager.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.herui.health.biz.dal.CardDAO;
import com.herui.health.biz.dal.model.CardDO;
import com.herui.health.biz.domain.HttpStatusEnum;
import com.herui.health.biz.domain.query.CardQuery;
import com.herui.health.biz.domain.query.PageQuery;
import com.herui.health.biz.domain.request.BatchGenerateCardRequest;
import com.herui.health.biz.domain.Result;
import com.herui.health.biz.manager.CardManager;
import com.herui.health.biz.utils.RandomUtils;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 14:15
 */
@Component
public class CardManagerImpl implements CardManager {

    private static final Logger logger = LoggerFactory.getLogger(CardManagerImpl.class);

    private static final Integer CardNoLenth=12;

    @Autowired
    private CardDAO cardDAO;
    /**
     * 批量生成卡号
     *
     * @param request
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Result<Boolean> batchGenerateCard(BatchGenerateCardRequest request) {
        logger.info("开始生成卡号,request:{}", JSON.toJSONString(request));
        if(request==null){
            return Result.fail(HttpStatusEnum.COMMON_CODE,"参数无效");
        }

        if(!StringUtils.isNumeric(request.getStartNo())){
            return Result.fail(HttpStatusEnum.COMMON_CODE,"起始号错误");
        }
        int startNoLenth = request.getStartNo().length();
        Date now = new Date();
        int existsNum =0;
        int successNum = 0;
        for (int i=0;i<=request.getCardNum();i++) {
            Long newNo = Long.parseLong(request.getStartNo())+i;
            String cardNo= request.getPrefix().toString()+ String.format("%0"+startNoLenth+"d", newNo);


            //卡号是否存在
            CardDO existsCard = cardDAO.selectByCard(Long.parseLong(cardNo));
            if(existsCard!=null){
                logger.error("卡号重复:"+existsCard.getCardNo());
                existsNum++;
                continue;
            }
            //保存
            CardDO cardDO = new CardDO();
            cardDO.setCardNo(Long.parseLong(cardNo));
            cardDO.setCardStatus(0);
            cardDO.setCardPwd(RandomUtils.getStringRandom(6));
            cardDO.setGmtCreated(now);
            cardDO.setGmtModified(now);
            cardDO.setIsDelete(0);
            cardDO.setUuid(RandomUtils.getUuid());
            cardDAO.insert(cardDO);
            successNum++;
            logger.info("生成卡号:"+cardNo);
        }
        if(existsNum>0){
            return Result.fail(HttpStatusEnum.COMMON_CODE,String.format("部分卡号已存在"));
        }
        logger.info("卡号生成结束");
        return Result.success();
    }

    @Override
    public Result<PageInfo<CardDO>> queryCardByPage(PageQuery<CardQuery> query) {
        PageHelper.startPage(query.getPageNo(),query.getPageSize());
        List<CardDO> list = cardDAO.selectByPage(query.getRequest());
        PageInfo<CardDO> pageInfo = new PageInfo<CardDO>(list);
        return Result.success(pageInfo);
    }

}
