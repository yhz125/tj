package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.HealthItemDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HealthItemDAO继承基类
 */
@Mapper
@Repository
public interface HealthItemDAO extends MyBatisBaseDao<HealthItemDO, Long> {
}