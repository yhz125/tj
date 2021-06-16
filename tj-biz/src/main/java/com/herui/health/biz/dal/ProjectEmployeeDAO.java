package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.ProjectEmployeeDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ProjectEmployeeDAO继承基类
 */
@Mapper
@Repository
public interface ProjectEmployeeDAO extends MyBatisBaseDao<ProjectEmployeeDO, Long> {
}