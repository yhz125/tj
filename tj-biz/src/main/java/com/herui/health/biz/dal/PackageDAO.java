package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.PackageDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PackageDAO继承基类
 */
@Mapper
@Repository
public interface PackageDAO extends MyBatisBaseDao<PackageDO, Long> {
}