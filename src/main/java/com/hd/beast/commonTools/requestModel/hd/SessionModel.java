package com.hd.beast.commonTools.requestModel.hd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionModel {
    private String authorize_object_cv="1";
    private String dev_unique="";
    private String tz_id="Asia/Shanghai";
    private String token="";


}
