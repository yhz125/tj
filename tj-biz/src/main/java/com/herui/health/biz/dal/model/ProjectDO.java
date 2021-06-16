package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 项目表
 */
@Data
public class ProjectDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * logo
     */
    private String logo;

    /**
     * 是否支持家属预约
     */
    private Byte isSportFamily;

    /**
     * 是否支持员工升级套餐
     */
    private Byte isSportUpgrade;

    /**
     * 域名前缀
     */
    private String domainPrefix;

    /**
     * 提前预约天数
     */
    private Integer leadDay;

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