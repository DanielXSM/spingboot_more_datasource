package com.hd.beast.commonTools.requestModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HDRequest {
    private HDSession security;
    private HDService service;
    private String back="j";
    private String call_uuid="";
    private HDClient client;
    private HDParameter parameters;
}
