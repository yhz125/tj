package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.CardPackageDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CardPackageDAO继承基类
 */
@Mapper
@Repository
public interface CardPackageDAO extends MyBatisBaseDao<CardPackageDO, Long> {
}