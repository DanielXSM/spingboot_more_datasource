package com.hd.beast.commonTools.responseModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnHeadModel {
    private String result;
    private String bl;
    private String function;

}
