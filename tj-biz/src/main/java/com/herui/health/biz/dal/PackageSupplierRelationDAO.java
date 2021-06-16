package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.PackageSupplierRelationDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PackageSupplierRelationDAO继承基类
 */
@Mapper
@Repository
public interface PackageSupplierRelationDAO extends MyBatisBaseDao<PackageSupplierRelationDO, Long> {
}