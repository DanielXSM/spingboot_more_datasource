package com.hd.beast.commonTools.requestModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HDParameter {
    private List<Map<String,Object>> parameter;
}
