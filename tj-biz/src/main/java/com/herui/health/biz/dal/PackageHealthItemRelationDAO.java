package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.PackageHealthItemRelationDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PackageHealthItemRelationDAO继承基类
 */
@Mapper
@Repository
public interface PackageHealthItemRelationDAO extends MyBatisBaseDao<PackageHealthItemRelationDO, Long> {
}