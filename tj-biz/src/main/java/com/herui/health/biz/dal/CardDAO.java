package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.CardDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CardDAO继承基类
 */
@Mapper
@Repository
public interface CardDAO extends MyBatisBaseDao<CardDO, Long> {
}