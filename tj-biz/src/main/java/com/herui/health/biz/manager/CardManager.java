/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.manager;

import com.github.pagehelper.PageInfo;
import com.herui.health.biz.dal.model.CardDO;
import com.herui.health.biz.domain.query.CardQuery;
import com.herui.health.biz.domain.query.PageQuery;
import com.herui.health.biz.domain.request.BatchGenerateCardRequest;
import com.herui.health.biz.domain.Result;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 14:15
 */
public interface CardManager {

    /**
     * 批量生成卡号
     * @param request
     * @return
     */
    Result<Boolean> batchGenerateCard(BatchGenerateCardRequest request);

    Result<PageInfo<CardDO>> queryCardByPage(PageQuery<CardQuery> query);


}
