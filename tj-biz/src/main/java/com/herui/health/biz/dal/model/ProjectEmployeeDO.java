package com.herui.health.biz.dal.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 企业人员表
 */
@Data
public class ProjectEmployeeDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 员工uuid
     */
    private String uuid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 证件号
     */
    private String idNo;

    /**
     * 登录密码
     */
    private String pwd;

    /**
     * 性别(1:男,2:女)
     */
    private Byte sex;

    /**
     * 婚否(0:全部,1:已婚,2:未婚)
     */
    private Byte marriageStatus;

    /**
     *  邮箱地址
     */
    private String email;

    /**
     *  标识(区分不同级别、类型)
     */
    private String extFlag;

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