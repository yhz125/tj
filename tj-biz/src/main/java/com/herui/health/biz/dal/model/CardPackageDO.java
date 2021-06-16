package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 绑卡明细表
 */
@Data
public class CardPackageDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 卡号uuid
     */
    private String cardUuid;

    /**
     * 套列uuid
     */
    private String packageUuid;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 状态(0:正常可用,1:已使用,2:作废)
     */
    private String status;

    /**
     * 套餐类型(1:员工套餐,2:家属套餐)
     */
    private Byte packageType;

    /**
     * 过期时间(如果没有设置些时间，跟随项目的截止日期)
     */
    private Date expiresDate;

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