/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 日期时间工具类
 *
 * @version 1.0
 * @author bojiangzhou 2017-12-28
 */
public class DateUtils {

    /**
     * 日期时间匹配格式
     */
    public interface Pattern {
        //
        // 常规模式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyy-MM-dd
         */
        String DATE = "yyyy-MM-dd";
        /**
         * yyyy-MM-dd HH:mm:ss
         */
        String DATETIME = "yyyy-MM-dd HH:mm:ss";
        /**
         * yyyy-MM-dd HH:mm
         */
        String DATETIME_MM = "yyyy-MM-dd HH:mm";
        /**
         * yyyy-MM-dd HH:mm:ss.SSS
         */
        String DATETIME_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
        /**
         * HH:mm
         */
        String TIME = "HH:mm";
        /**
         * HH:mm:ss
         */
        String TIME_SS = "HH:mm:ss";

        //
        // 系统时间格式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyy/MM/dd
         */
        String SYS_DATE = "yyyy/MM/dd";
        /**
         * yyyy/MM/dd HH:mm:ss
         */
        String SYS_DATETIME = "yyyy/MM/dd HH:mm:ss";
        /**
         * yyyy/MM/dd HH:mm
         */
        String SYS_DATETIME_MM = "yyyy/MM/dd HH:mm";
        /**
         * yyyy/MM/dd HH:mm:ss.SSS
         */
        String SYS_DATETIME_SSS = "yyyy/MM/dd HH:mm:ss.SSS";

        //
        // 无连接符模式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyyMMdd
         */
        String NONE_DATE = "yyyyMMdd";
        /**
         * yyyyMMddHHmmss
         */
        String NONE_DATETIME = "yyyyMMddHHmmss";
        /**
         * yyyyMMddHHmm
         */
        String NONE_DATETIME_MM = "yyyyMMddHHmm";
        /**
         * yyyyMMddHHmmssSSS
         */
        String NONE_DATETIME_SSS = "yyyyMMddHHmmssSSS";
    }

    public static final String DEFAULT_PATTERN = Pattern.DATETIME;

    public static final String[] PARSE_PATTERNS = new String[]{
        Pattern.DATE,
        Pattern.DATETIME,
        Pattern.DATETIME_MM,
        Pattern.DATETIME_SSS,
        Pattern.SYS_DATE,
        Pattern.SYS_DATETIME,
        Pattern.SYS_DATETIME_MM,
        Pattern.SYS_DATETIME_SSS
    };

    /**
     * 格式化日期时间
     *
     * @param date 日期时间
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String format(Date date) {
        return format(date, DEFAULT_PATTERN);
    }

    /**
     * 格式化日期
     *
     * @param date 日期(时间)
     *
     * @param pattern 匹配模式 参考：{@link DateUtils.Pattern}
     *
     * @return 格式化后的字符串
     */
    public static String format(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        pattern = StringUtils.isNotBlank(pattern) ? pattern : DEFAULT_PATTERN;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 解析日期
     *
     * @param date 日期字符串
     *
     * @return 解析后的日期 默认格式：yyyy-MM-dd HH:mm:ss
     */
    public static Date parseDate(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        try {
            return DateUtils.parseDate(date, Pattern.DATETIME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解析日期
     *
     * @param date 日期
     *
     * @param pattern 格式 参考：{@link DateUtils.Pattern}
     *
     * @return 解析后的日期，默认格式：yyyy-MM-dd HH:mm:ss
     */
    public static Date parseDate(String date, String pattern) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        String[] parsePatterns;
        parsePatterns = StringUtils.isNotBlank(pattern) ? new String[]{pattern} : PARSE_PATTERNS;
        try {
            return DateUtils.parseDate(date, Pattern.DATETIME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
