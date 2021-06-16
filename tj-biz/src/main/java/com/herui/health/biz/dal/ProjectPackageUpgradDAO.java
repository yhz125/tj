package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.ProjectPackageUpgradDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ProjectPackageUpgradDAO继承基类
 */
@Mapper
@Repository
public interface ProjectPackageUpgradDAO extends MyBatisBaseDao<ProjectPackageUpgradDO, Long> {
}