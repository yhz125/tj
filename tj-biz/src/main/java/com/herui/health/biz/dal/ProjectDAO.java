package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.ProjectDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ProjectDAO继承基类
 */
@Mapper
@Repository
public interface ProjectDAO extends MyBatisBaseDao<ProjectDO, Long> {
}