package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 套餐明细表
 */
@Data
public class HealthItemDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 套餐明细uuid
     */
    private String uuid;

    /**
     * 名称
     */
    private String name;

    /**
     * 适用性别(0:全部,1:男,2:女)
     */
    private Byte sex;

    /**
     * 婚否(0:全部,1:已婚,2:未婚)
     */
    private Byte marriageStatus;

    /**
     * 外部机构套餐编码
     */
    private String supplierItemCode;

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

    /**
     * 套餐项目明细
     */
    private String desc;

    private static final long serialVersionUID = 1L;
}