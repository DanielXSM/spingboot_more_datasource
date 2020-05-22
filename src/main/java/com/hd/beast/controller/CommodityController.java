package com.hd.beast.controller;

import com.hd.beast.entity.entity1.TGoodsPlayPoint;
import com.hd.beast.entity.entity2.TManagerCommodity;
import com.hd.beast.service.service1.GoodsPlayPointsService;
import com.hd.beast.service.service2.Manager2CommodityService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class CommodityController {
//    private static final Logger Log=LoggerFactory.getLogger(CommodityController.class);
    @Autowired
    private GoodsPlayPointsService goodsPlayPointsService;

    @Resource
    private Manager2CommodityService manager2CommodityService;
    @Autowired
    private Environment enviroment;

    @Value("${active.zdp}")
    private String active;

    @ResponseBody
    @RequestMapping("/")
    public String queryProduct() {
        String[] activeProfiles = enviroment.getActiveProfiles();
        Arrays.asList(activeProfiles).stream().forEach(e -> {
            System.out.println("多环境配置：" + e);
        });
        String[] defaultProfiles = enviroment.getDefaultProfiles();
        Arrays.asList(defaultProfiles).stream().forEach(e -> {
            System.out.println("默认环境配置：" + e);
        });
        String property = enviroment.getProperty("active.zdp");
        System.out.println("所在环境的变量值：" + property);
        System.out.println("注解情况下注入的变量值:" + active);
        return active + "welcome";

    }

    @RequestMapping("/queryGodds")
    @ResponseBody
    public String queryGodds() {
        List<TGoodsPlayPoint> tGoodsPlayPoints = goodsPlayPointsService.selectAllgoods();
        return tGoodsPlayPoints.toString();
    }

    /**
     * 查寻数据库2的商品列表
     * @return
     */
    @RequestMapping("/querysecond")
    @ResponseBody
    public String query2(){
        List<TManagerCommodity> tManagerCommodities = manager2CommodityService.querymanager2Commodity();
        System.out.println(tManagerCommodities.toString());
        return tManagerCommodities.toString();
    }

    /**
     * 更改商品的状态
     * @return
     */
    @RequestMapping("/update1")
    @ResponseBody
    public String update1(){
        int i= goodsPlayPointsService.updateUsingflagByCommodityId();
        return i+"";
    }
    /**
     * 查询商品1的商品详情
     * @return
     */
    @RequestMapping("/query/{id}")
    @ResponseBody
    public String query3(@PathVariable("id")String id){
        log.debug("日志输出测试 Debug");
        log.trace("日志输出测试 Trace");
        log.info("日志输出测试 Info");
        log.info("=================================================================>获取到的id:{}",id);
        TGoodsPlayPoint tGoodsPlayPoint= goodsPlayPointsService.querStringyById(id);
        return tGoodsPlayPoint.toString();
    }
}
