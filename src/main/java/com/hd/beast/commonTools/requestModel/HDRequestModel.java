package com.hd.beast.commonTools.requestModel;

import com.hd.beast.commonTools.requestModel.hd.HDRequest;
import com.hd.beast.commonTools.requestModel.hd.HDRmote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HDRequestModel implements Serializable {

private HDRequest request;

}
