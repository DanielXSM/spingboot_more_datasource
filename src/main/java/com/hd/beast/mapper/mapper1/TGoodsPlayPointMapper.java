package com.hd.beast.mapper.mapper1;

import com.hd.beast.entity.entity1.TGoodsPlayPoint;
import com.hd.beast.entity.entity1.TGoodsPlayPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TGoodsPlayPointMapper {
    long countByExample(TGoodsPlayPointExample example);

    int deleteByExample(TGoodsPlayPointExample example);

    int deleteByPrimaryKey(Long goodsNo);

    int insert(TGoodsPlayPoint record);

    int insertSelective(TGoodsPlayPoint record);

    List<TGoodsPlayPoint> selectByExample(TGoodsPlayPointExample example);

    TGoodsPlayPoint selectByPrimaryKey(Long goodsNo);

    int updateByExampleSelective(@Param("record") TGoodsPlayPoint record, @Param("example") TGoodsPlayPointExample example);

    int updateByExample(@Param("record") TGoodsPlayPoint record, @Param("example") TGoodsPlayPointExample example);

    int updateByPrimaryKeySelective(TGoodsPlayPoint record);

    int updateByPrimaryKey(TGoodsPlayPoint record);

    /**
     * 自定义dao 方法
     * @param id
     * @return
     */
    TGoodsPlayPoint selectById(Long id);
}