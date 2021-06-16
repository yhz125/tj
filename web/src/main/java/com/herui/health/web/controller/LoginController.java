/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.web.controller;

import com.herui.health.biz.manager.CardManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 13:05
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private CardManager cardManager;

    @RequestMapping("/init")
    public String login(Model model){
        cardManager.add();
        model.addAttribute("time",System.currentTimeMillis());
        return "login";

    }
}
