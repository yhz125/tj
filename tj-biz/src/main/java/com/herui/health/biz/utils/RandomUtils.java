/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.utils;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 20:11
 */
public class RandomUtils {

    /**
     * 生成随机数字和字母
     *
     * @param length
     * @return
     */
    public static String getStringRandom(int length) {
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();
        // 参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {
            sb.append(String.valueOf(random.nextInt(10)));
        }
        return sb.toString();
    }


    /**
     * 获取UUID
     *
     * @return
     */
    public static String getUuid() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }


}
