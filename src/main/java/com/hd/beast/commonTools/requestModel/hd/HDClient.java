package com.hd.beast.commonTools.requestModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HDClient {
    private HDRoute route;
    private HDRmote remote;
}
