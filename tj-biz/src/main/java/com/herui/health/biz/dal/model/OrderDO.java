package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 预约明细表
 */
@Data
public class OrderDO implements Serializable {
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
     * 项目id
     */
    private Long projectId;

    /**
     * 套餐uuid
     */
    private String healthItemUuid;

    /**
     * 外部机构套餐编码
     */
    private String supplierItemCode;

    /**
     * 绑卡明细ID
     */
    private Long cardPackageId;

    /**
     * 套餐类型(1:员工套餐,2:家属套餐)
     */
    private Byte packageType;

    /**
     * 预约日期
     */
    private Date hdate;

    /**
     * 状态(0:待处理,2:已预约,3:已检,4:已取消)
     */
    private Byte orderStatus;

    /**
     * 姓名
     */
    private String name;

    /**
     * 证件号
     */
    private String idNo;

    /**
     * 适用性别(0:全部,1:男,2:女)
     */
    private Byte sex;

    /**
     * 婚否(0:全部,1:已婚,2:未婚)
     */
    private Byte marriageStatus;

    /**
     * 机构uuid
     */
    private String supplierUuid;

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
     * 备注
     */
    private String remark;

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