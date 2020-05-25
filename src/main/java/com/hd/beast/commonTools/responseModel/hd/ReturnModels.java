package com.hd.beast.commonTools.responseModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnModels {
    private String call_uuid;
    private String used_ms;
    private ReturnHeadModel head;
}
