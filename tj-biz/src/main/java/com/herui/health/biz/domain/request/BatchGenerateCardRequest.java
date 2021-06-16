/*
 * Copyright (c) 2001-2021 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.herui.health.biz.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

/**
 * 批量生成卡号
 *
 * @author weiyi
 * @version V1.0
 * @since 2021-06-16 19:03
 */
@Data
public class BatchGenerateCardRequest implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 卡号前缀
     */
    @NotNull(message = "卡号前缀不能为空")
    private Long prefix;

    /**
     * 起始号
     */
    @NotBlank(message = "起始号不能为空")
    private String startNo;

    /**
     * 生成数量
     */
    @NotNull(message = "生成数量不能为空")
    @Range(max = 9999,message = "单次生成数量不能超过9999")
    private Integer cardNum;

    /**
     * 操作人
     */
    private String operator;
}
