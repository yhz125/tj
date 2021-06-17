package com.herui.health.biz.dal;

import com.herui.health.biz.dal.model.CardDO;
import com.herui.health.biz.domain.query.CardQuery;
import com.herui.health.biz.domain.query.PageQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * CardDAO继承基类
 */
@Mapper
@Repository
public interface CardDAO extends MyBatisBaseDao<CardDO, Long> {

    /**
     * 根据卡号查询明细
     * @param cardNo
     * @return
     */
    CardDO selectByCard(Long cardNo);

    /**
     * 分页
     * @param query
     * @return
     */
    List<CardDO> selectByPage(CardQuery query);

}