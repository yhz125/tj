/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.manager.impl;

import com.herui.health.biz.dal.CardDAO;
import com.herui.health.biz.dal.model.CardDO;
import com.herui.health.biz.manager.CardManager;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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


    @Autowired
    private CardDAO cardDAO;

    @Override
    public Void add() {
        logger.error("报错了");
        CardDO card = new CardDO();
        card.setCardNo(12345678L);
        card.setCardPwd("123456");
        card.setGmtCreated(new Date());
        card.setGmtModified(new Date());
        card.setIsDelete(0);

        cardDAO.insert(card);
        return null;
    }
}
