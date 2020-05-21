package com.hd.beast.service.service1.impl;

import com.hd.beast.entity.entity1.TGoodsPlayPoint;
import com.hd.beast.entity.entity1.TGoodsPlayPointExample;
import com.hd.beast.entity.entity2.TManagerCommodity;
import com.hd.beast.entity.entity2.TManagerCommodityExample;
import com.hd.beast.mapper.mapper1.TGoodsPlayPointMapper;
import com.hd.beast.mapper.mapper2.TManagerCommodityMapper;
import com.hd.beast.service.service1.GoodsPlayPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GoodsPlayPointsServiceImpl implements GoodsPlayPointsService {
    @Autowired
    private TGoodsPlayPointMapper tGoodsPlayPointMapper;
    @Autowired
    private TManagerCommodityMapper tManagerCommodityMapper;

    @Override
    public List<TGoodsPlayPoint> selectAllgoods() {
        TGoodsPlayPointExample tGoodsPlayPointExample = new TGoodsPlayPointExample();
        TGoodsPlayPointExample.Criteria criteria = tGoodsPlayPointExample.createCriteria();
//        Short shorts=1;
        criteria.andSortFlagEqualTo(Short.valueOf("1"));
        List<TGoodsPlayPoint> tGoodsPlayPoints = tGoodsPlayPointMapper.selectByExample(tGoodsPlayPointExample);
        return tGoodsPlayPoints;
    }


    /**
     * 修改商品的状态
     * @return
     */
    //选择数据库事务管理器，回滚类型，事务的传播机制，事务的隔离性
    @Transactional(value = "transactionManager1",rollbackFor = {RuntimeException.class,Error.class},propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED )
    @Override
    public int updateUsingflagByCommodityId() {
        TGoodsPlayPoint tGoodsPlayPoint=new TGoodsPlayPoint();
        tGoodsPlayPoint.setShowOn(Short.valueOf("5"));
        TGoodsPlayPointExample tGoodsPlayPointExample=new TGoodsPlayPointExample();
        TGoodsPlayPointExample.Criteria criteria = tGoodsPlayPointExample.createCriteria();
        criteria.andGoodsNoEqualTo(1004L);

        int i = tGoodsPlayPointMapper.updateByExampleSelective(tGoodsPlayPoint, tGoodsPlayPointExample);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<更新成功的数量："+i);

        TGoodsPlayPoint tGoodsPlayPoint1=new TGoodsPlayPoint();
        tGoodsPlayPoint1.setShowOn(Short.valueOf("10"));
        TGoodsPlayPointExample tGoodsPlayPointExample1=new TGoodsPlayPointExample();
        TGoodsPlayPointExample.Criteria criteria1 = tGoodsPlayPointExample1.createCriteria();
        TGoodsPlayPointExample.Criteria or = tGoodsPlayPointExample1.or();
        or.andGoodsNoEqualTo(1003L);
        criteria1.andGoodsNoEqualTo(1005L);
        int i1 = tGoodsPlayPointMapper.updateByExampleSelective(tGoodsPlayPoint1, tGoodsPlayPointExample1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>再次更新成功的数量是："+i1);

        //跨库操作
        TManagerCommodity tManagerCommodity=new TManagerCommodity();
        tManagerCommodity.setRealPrice(new BigDecimal("0.01"));
        TManagerCommodityExample tManagerCommodityExample=new TManagerCommodityExample();
        TManagerCommodityExample.Criteria criteria2 = tManagerCommodityExample.createCriteria();
        criteria2.andCommodityIdEqualTo(1L);

        int i2 = tManagerCommodityMapper.updateByExampleSelective(tManagerCommodity, tManagerCommodityExample);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>更新商品库帽子的结果："+i2);

        TManagerCommodity tManagerCommodity1=new TManagerCommodity();
        tManagerCommodity1.setRealPrice(new BigDecimal("0.01"));
        TManagerCommodityExample tManagerCommodityExample1=new TManagerCommodityExample();
        TManagerCommodityExample.Criteria criteria3 = tManagerCommodityExample1.createCriteria();
        criteria3.andCommodityIdEqualTo(2L);

        int i22 = tManagerCommodityMapper.updateByExampleSelective(tManagerCommodity1, tManagerCommodityExample1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>更新商品库帽子的结果："+i22);

        //回滚
        if(1==i){
            throw new RuntimeException(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>test--->异常");
        }
        System.out.println("执行结束》》》》》》》》》》》》》》》");
        return 0;
//        数据库事务只支持单个数据源
    }

    @Override
    public TGoodsPlayPoint querStringyById(String id) {
        TGoodsPlayPoint tGoodsPlayPoint= tGoodsPlayPointMapper.selectById(Long.valueOf(id));
        return tGoodsPlayPoint;
    }
}
