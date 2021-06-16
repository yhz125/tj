/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 12:45
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/getTime")
    public Long getTime(){
        try{
            logger.info("开始记录日志");
            return System.currentTimeMillis()/0;
        }
        catch (Exception e){
            logger.error("数据异常",e);
        }
        return 0L;

    }
}
