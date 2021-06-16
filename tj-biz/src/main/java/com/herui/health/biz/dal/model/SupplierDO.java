package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 体检机构表
 */
@Data
public class SupplierDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 机构uuid
     */
    private String uuid;

    /**
     * 机构外部编码
     */
    private String outCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 所在省
     */
    private Integer province;

    /**
     * 所在市
     */
    private Integer city;

    /**
     * 所在区
     */
    private Integer district;

    /**
     * 坐标x
     */
    private BigDecimal pointX;

    /**
     * 坐标y
     */
    private BigDecimal pointY;

    /**
     * 每周休息日(1,2,3,4,5,6,7)
     */
    private String wekDayOff;

    /**
     * 机构状态(0:关闭,1:正常)
     */
    private Byte supplierStatus;

    /**
     * 屏蔽日期(多个日期用逗号隔开)
     */
    private String technicalDates;

    /**
     * 交通路线
     */
    private String trafficRoute;

    /**
     * 营业时间
     */
    private String shopHours;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 父机构
     */
    private String parentUuid;

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