package com.hd.beast.commonTools.restTemplateUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hd.beast.commonTools.requestModel.HDRequestModel;
import com.hd.beast.commonTools.requestModel.hd.*;
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

    public  ResponseEntity<String>  sendPostRequest(String url, Map<String, Object> requestParam) {

        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        //以表单你的方式提交
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<Map<String, Object>> request = new HttpEntity<Map<String, Object>>(requestParam, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, request, String.class);
        String body = responseEntity.getBody();
        System.out.println(body);
        return responseEntity;

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
