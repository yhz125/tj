/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.web.controller;

import com.herui.health.biz.domain.Result;
import com.herui.health.biz.domain.request.BatchGenerateCardRequest;
import com.herui.health.biz.manager.CardManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 20:39
 */
@Controller
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardManager cardManager;

    /**
     * 批量生成卡号
     * @param request
     * @return
     */
    @PostMapping("/batchGenerateCard")
    @ResponseBody
    public Result<Boolean> batchGenerateCard(@RequestBody  BatchGenerateCardRequest request){
        return cardManager.batchGenerateCard(request);
    }
}
