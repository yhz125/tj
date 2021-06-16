package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 套餐明细关联表
 */
@Data
public class PackageHealthItemRelationDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 套餐uuid
     */
    private String packageUuid;

    /**
     * 明细uuid
     */
    private String healthItemUuid;

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