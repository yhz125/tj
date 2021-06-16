package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 套餐表
 */
@Data
public class PackageDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 套餐uuid
     */
    private String uuid;

    /**
     * 项目id
     */
    private Long projectId;

    /**
     * 名称
     */
    private String name;

    /**
     * 套餐状态(0:下架,1:正常)
     */
    private Byte packageStatus;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    private BigDecimal price;

    /**
     * 标识(员工升级套餐时匹配对应级别)
     */
    private String upgradFlag;

    /**
     * 产品描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 售价
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}