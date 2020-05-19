package com.hd.beast.service.service2.impl;

import com.hd.beast.entity.entity2.TManagerCommodity;
import com.hd.beast.entity.entity2.TManagerCommodityExample;
import com.hd.beast.mapper.mapper2.TManagerCommodityMapper;
import com.hd.beast.service.service2.Manager2CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Manager2CommodityServiceImpl implements Manager2CommodityService {
    @Resource
    private TManagerCommodityMapper tManagerCommodityMapper;
    @Override
    public List<TManagerCommodity> querymanager2Commodity() {
        TManagerCommodityExample tGoodsPlayPointExample = new TManagerCommodityExample();
//        TManagerCommodityExample.Criteria criteria = tGoodsPlayPointExample.createCriteria();
        Short shorts=1;
//        criteria.andUsingFlagEqualTo(shorts);
        List<TManagerCommodity> tGoodsPlayPoints = tManagerCommodityMapper.selectByExample(tGoodsPlayPointExample);

        return tGoodsPlayPoints;
    }
}
