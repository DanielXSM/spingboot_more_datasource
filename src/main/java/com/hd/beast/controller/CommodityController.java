package com.hd.beast.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hd.beast.commonTools.requestModel.HDRequestModel;
import com.hd.beast.commonTools.requestModel.hd.*;
import com.hd.beast.commonTools.restTemplateUtils.RestemplateRequest;
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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@Slf4j
public class CommodityController {
//    private static final Logger Log=LoggerFactory.getLogger(CommodityController.class);
    @Autowired
    private GoodsPlayPointsService goodsPlayPointsService;

    @Autowired
    private RestemplateRequest restemplateRequest;
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

    /**
     * 查找积分牌价信息
     * @return
     */
    @RequestMapping("queryPointsPrice")
    @ResponseBody
    public JSONObject queryPointsPrice(){
        HDService hdService = new HDService("gp.point.bl.OrderBL", "queryQuotePriceList");

//        System.out.println(json_hdService);


        SessionModel sessionModel = new SessionModel();
        sessionModel.setAuthorize_object_cv("1");
        sessionModel.setDev_unique("B67B45CF0ABF8FCAD35496AE0151848D");
        sessionModel.setToken("");
        sessionModel.setTz_id("Asia/Shanghai");
        HDSession hdSession = new HDSession(sessionModel);

        HDRequest hdRequest = new HDRequest();
        hdRequest.setSecurity(hdSession);
        hdRequest.setService(hdService);
        List<Object> client_list=new ArrayList<>();
        HDRmote hdRmote=new HDRmote();
        HDRoute hdRoute=new HDRoute();
        HDClient hdClient=new HDClient();
        hdClient.setRoute(hdRoute);
        hdClient.setRemote(hdRmote);

        hdRequest.setClient(hdClient);
        hdRequest.setCall_uuid("RZ0FNI5VJUJ4P53QDJ3MBF1YC4SWWT0Y");
        hdRequest.setBack("j");

        Map<String,Object> maps=new HashMap<>();
        maps.put("query_type","List");
//        maps.put("order_id","1");
   /*     Map<String,Object> maps1=new HashMap<>();
        maps1.put("user_seq","2");
        maps1.put("order_id","2");*/
        HDParameter hdParameter=new HDParameter();
        List<Map<String,Object>> list=new ArrayList<>();
        list.add(maps);
//        list.add(maps1);

        hdParameter.setParameter(list);
        hdRequest.setParameters(hdParameter);
        Object json_hdRequest = JSON.toJSON(hdRequest);
        HDRequestModel hdRequestModel=new         HDRequestModel();
        hdRequestModel.setRequest(hdRequest);

        Object json_hdRequestModel = JSON.toJSON(hdRequestModel);

        String url="http://10.100.21.101:80/PS";
        Map<String, Object> requestParam=new HashMap<>();
        requestParam.put("request",json_hdRequest);
        System.out.println(json_hdRequestModel);
        JSONObject jsonObject = restemplateRequest.sendPostRequest(url, requestParam);
        JSONArray quotePrice = jsonObject.getJSONArray("quotePrice");
        Map<String,String>maps_res=new HashMap();
        StringBuilder stringBuilder=new StringBuilder();
        String property = System.getProperty("line.separator");
        for(int i=0;i<quotePrice.size();i++){
            JSONObject o = (JSONObject)quotePrice.get(i);
            String name_common = o.getString("name_common");
            String name_point = o.getString("name_point");
            String amplitude = o.getString("amplitude");
            System.out.println(name_common+":"+name_point+"==="+amplitude);
//            stringBuilder.append(name_common+":"+name_point+"==="+amplitude+"\n");
//            maps_res.put(name_common+"："+name_point,amplitude)
        }
       return jsonObject;
    }
}
