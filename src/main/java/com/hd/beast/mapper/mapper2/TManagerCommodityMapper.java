package com.hd.beast.mapper.mapper2;

import com.hd.beast.entity.entity2.TManagerCommodity;
import com.hd.beast.entity.entity2.TManagerCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TManagerCommodityMapper {
    long countByExample(TManagerCommodityExample example);

    int deleteByExample(TManagerCommodityExample example);

    int deleteByPrimaryKey(Long commodityId);

    int insert(TManagerCommodity record);

    int insertSelective(TManagerCommodity record);

    List<TManagerCommodity> selectByExample(TManagerCommodityExample example);

    TManagerCommodity selectByPrimaryKey(Long commodityId);

    int updateByExampleSelective(@Param("record") TManagerCommodity record, @Param("example") TManagerCommodityExample example);

    int updateByExample(@Param("record") TManagerCommodity record, @Param("example") TManagerCommodityExample example);

    int updateByPrimaryKeySelective(TManagerCommodity record);

    int updateByPrimaryKey(TManagerCommodity record);
}