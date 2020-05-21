package com.hd.beast.service.service1.impl;

import com.hd.beast.entity.entity1.TGoodsPlayPoint;
import com.hd.beast.entity.entity1.TGoodsPlayPointExample;
import com.hd.beast.mapper.mapper1.TGoodsPlayPointMapper;
import com.hd.beast.service.service1.GoodsPlayPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        if(1==i){
            throw new RuntimeException(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>test--->异常");
        }
        System.out.println("执行结束》》》》》》》》》》》》》》》");
        return 0;
    }
}
