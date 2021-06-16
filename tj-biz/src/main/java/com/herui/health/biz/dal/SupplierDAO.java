package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.SupplierDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SupplierDAO继承基类
 */
@Mapper
@Repository
public interface SupplierDAO extends MyBatisBaseDao<SupplierDO, Long> {
}