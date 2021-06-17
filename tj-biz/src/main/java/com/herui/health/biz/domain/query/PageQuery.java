/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.domain.query;

import java.io.Serializable;

import lombok.Data;

/**
 * TODO
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-17 13:35
 */

@Data
public class PageQuery<R> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认页码
     */
    public static final int DEFAULT_PAGE_NO = 1;
    /**
     * 默认每页显示的记录数
     */
    public static final int DEFAULT_PAGE_SIZE = 20;
    /**
     * 最大每页显示的记录数
     */
    public static final int MAX_PAGE_SIZE = 200;

    /**
     * 偏移量
     */
    private long offset;
    /**
     * 页码
     */
    private int pageNo;
    /**
     * 每页大小
     */
    private int pageSize;
    /**
     * 查询条件
     */
    private R request;

    public PageQuery() {
        this.pageNo = DEFAULT_PAGE_NO;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    public long getOffset() {
        if (offset > 0) {
            return offset;
        }
        return (pageNo - 1) * pageSize;
    }

    @Override
    public String toString() {
        return "PageQuery{" +
            "offset=" + offset +
            ", pageSize=" + pageSize +
            ", request=" + request +
            '}';
    }
}