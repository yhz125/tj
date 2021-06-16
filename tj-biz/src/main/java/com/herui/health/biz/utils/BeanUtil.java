/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.utils;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 12:56
 */
public class BeanUtil {
    private static final Logger logger = LoggerFactory.getLogger(BeanUtil.class);

    /**
     * 对象转换 - 单个
     *
     * @param source
     * @param target
     * @param <T>
     * @return
     */
    public static <T> T convert(Object source, Class<T> target) {
        T targetObj;

        try {
            if (source == null) {
                return null;
            }
            targetObj = target.newInstance();
            BeanUtils.copyProperties(source, targetObj);
            return targetObj;
        } catch (InstantiationException e) {
            logger.error(String.format("对象转换异常[%s] to [%s]", source.getClass(), target), e);
        } catch (IllegalAccessException e) {
            logger.error(String.format("对象转换异常[%s] to [%s]", source.getClass(), target), e);
        }

        return null;
    }

    /**
     * 对象转换 - 批量
     *
     * @param source
     * @param target
     * @param <T>
     * @param <S>
     * @return
     */
    public static <T, S> List<T> listConvert(List<S> source, Class<T> target) {
        if (source == null) {
            return null;
        }

        List<T> targetObj = new ArrayList<>();
        for (S s : source) {
            targetObj.add(convert(s, target));
        }

        return targetObj;
    }
}
