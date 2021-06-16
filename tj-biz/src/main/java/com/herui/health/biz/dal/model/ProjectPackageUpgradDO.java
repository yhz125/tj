package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 项目可升级套餐（包括家属购买）
 */
@Data
public class ProjectPackageUpgradDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 项目编码
     */
    private String projectCode;

    /**
     * 套餐uuid
     */
    private String packageUuid;

    /**
     * 升级类型(1:员工升级套餐,2:家属套餐)
     */
    private Byte upgradType;

    /**
     * 员工升级套餐时匹配对应级别
     */
    private String upgradFlag;

    /**
     * 适用性别(0:全部,1:男,2:女)
     */
    private Byte sex;

    /**
     * 婚否(0:全部,1:已婚,2:未婚)
     */
    private Byte marriageStatus;

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