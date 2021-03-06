package com.hd.beast.commonTools.restTemplateUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hd.beast.commonTools.BizException;
import com.hd.beast.commonTools.requestModel.HDRequestModel;
import com.hd.beast.commonTools.requestModel.hd.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RestemplateRequest {
    @Resource
    private RestTemplate restTemplate;

    public JSONObject sendPostRequest(String url, Map<String, Object> requestParam) {

        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        //以表单你的方式提交
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<Map<String, Object>> request = new HttpEntity<Map<String, Object>>(requestParam, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, request, String.class);
        String body = responseEntity.getBody();
        JSONObject jsonObject = JSON.parseObject(body);
        String aReturn = jsonObject.getString("return");

        System.out.println("==============================>return 的数据" + aReturn);
        JSONObject jsonObject1 = JSON.parseObject(aReturn);
        String head = jsonObject1.getString("head");
        System.out.println("head 的数据======================>" + head);
        JSONObject jsonObject2 = JSON.parseObject(head);
//        JSONObject jsonObject3 = JSON.parseObject(jsonObject2);
        String result = jsonObject2.getString("result");
        System.out.println("获取的result 的结果===================>" + result);
        JSONObject jsonObject3=null;
        if (result.equalsIgnoreCase("success")) {
            //成功的状态
            String data = jsonObject1.getString("data");
            jsonObject3 = JSON.parseObject(data);
            System.out.println("获取data的数据：" + data);
            return jsonObject3;
        } else {
            //失败的状态
            String error_reason = jsonObject2.getString("error_reason");
            String error_code = jsonObject2.getString("error_code");
            String error_type = jsonObject2.getString("error_type");
            //数据异常.抛出异常
            throw new BizException(error_code, error_reason);
        }
    }

    public static void main(String[] args) {
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
        List<Object> client_list = new ArrayList<>();
        HDRmote hdRmote = new HDRmote();
        HDRoute hdRoute = new HDRoute();
        HDClient hdClient = new HDClient();
        hdClient.setRoute(hdRoute);
        hdClient.setRemote(hdRmote);

        hdRequest.setClient(hdClient);
        hdRequest.setCall_uuid("RZ0FNI5VJUJ4P53QDJ3MBF1YC4SWWT0Y");
        hdRequest.setBack("j");

        Map<String, Object> maps = new HashMap<>();
        maps.put("query_type", "List");
//        maps.put("order_id","1");
   /*     Map<String,Object> maps1=new HashMap<>();
        maps1.put("user_seq","2");
        maps1.put("order_id","2");*/
        HDParameter hdParameter = new HDParameter();
        List<Map<String, Object>> list = new ArrayList<>();
        list.add(maps);
//        list.add(maps1);

        hdParameter.setParameter(list);
        hdRequest.setParameters(hdParameter);
        Object json_hdRequest = JSON.toJSON(hdRequest);
        HDRequestModel hdRequestModel = new HDRequestModel();
        hdRequestModel.setRequest(hdRequest);

        Object json_hdRequestModel = JSON.toJSON(hdRequestModel);

        String url = "http://10.100.21.101:80/PS";
        Map<String, Object> requestParam = new HashMap<>();
        requestParam.put("request", json_hdRequest);
//        sendPostRequest(url, requestParam);
        System.out.println(json_hdRequestModel);

    }
}
