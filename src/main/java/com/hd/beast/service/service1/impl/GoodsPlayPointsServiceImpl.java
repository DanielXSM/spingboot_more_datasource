package com.hd.beast.service.service1.impl;

import com.hd.beast.entity.entity1.TGoodsPlayPoint;
import com.hd.beast.entity.entity1.TGoodsPlayPointExample;
import com.hd.beast.mapper.mapper1.TGoodsPlayPointMapper;
import com.hd.beast.service.service1.GoodsPlayPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsPlayPointsServiceImpl implements GoodsPlayPointsService {
    @Autowired
    private TGoodsPlayPointMapper tGoodsPlayPointMapper;

    @Override
    public List<TGoodsPlayPoint> selectAllgoods() {
        TGoodsPlayPointExample tGoodsPlayPointExample = new TGoodsPlayPointExample();
        TGoodsPlayPointExample.Criteria criteria = tGoodsPlayPointExample.createCriteria();
//        Short shorts=1;
        criteria.andSortFlagEqualTo(Short.valueOf("1"));
        List<TGoodsPlayPoint> tGoodsPlayPoints = tGoodsPlayPointMapper.selectByExample(tGoodsPlayPointExample);
        return tGoodsPlayPoints;
    }
}
