package com.hd.beast;

import com.hd.beast.service.service1.GoodsPlayPointsService;
import com.hd.beast.service.service1.impl.GoodsPlayPointsServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class I20TgoodsPlayPoints extends BeastApplicationTests {
    @Autowired
    private GoodsPlayPointsService goodsPlayPointsService;


    @Test
    public void testGetEntFileById(){
        int i = goodsPlayPointsService.updateUsingflagByCommodityId();
        System.out.println("更新结果");
//        Assert.assertSame("企业数量有误",500,entFileService.getCount());
    }
}
