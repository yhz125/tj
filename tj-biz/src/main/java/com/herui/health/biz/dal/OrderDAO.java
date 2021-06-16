package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * OrderDAO继承基类
 */
@Mapper
@Repository
public interface OrderDAO extends MyBatisBaseDao<OrderDO, Long> {
}