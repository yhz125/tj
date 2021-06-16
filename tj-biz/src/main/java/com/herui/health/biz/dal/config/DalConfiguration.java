/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.dal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 14:01
 */

@Configuration
@MapperScan(basePackages = {"com.herui.health.biz.dal"})
@PropertySource(value= {"classpath:application-dal.properties"})
public class DalConfiguration {
}
