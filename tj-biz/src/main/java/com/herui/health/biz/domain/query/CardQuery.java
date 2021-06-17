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
 * @since 2021-06-17 13:37
 */
@Data
public class CardQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 超始号段
     */
    private Long cardNoStart;

    /**
     * 结束号段
     */
    private Long cardNoEnd;

    /**
     * 卡状态(0:未绑套餐,1:已绑套餐,2:作废)
     */
    private Integer cardStatus;


}
