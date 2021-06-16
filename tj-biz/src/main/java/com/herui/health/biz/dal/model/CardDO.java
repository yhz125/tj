package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 卡明细表
 */
@Data
public class CardDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 卡号uuid
     */
    private String uuid;

    /**
     * 卡号
     */
    private Long cardNo;

    /**
     * 卡密
     */
    private String cardPwd;

    /**
     * 卡状态(0:未绑套餐,1:已绑套餐,2:作废)
     */
    private Integer cardStatus;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 是否删除；0--否，1--是
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}