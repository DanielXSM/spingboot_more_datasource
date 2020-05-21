package com.hd.beast.controller;

import com.hd.beast.commonTools.BizException;
import com.hd.beast.commonTools.CommonExceptionEnum;
import com.hd.beast.vo.ResultBody;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value= BizException.class)
    @ResponseBody
    public ResultBody bizExceptionHandler(HttpServletRequest req ,BizException e){

    return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e){

        return ResultBody.error(CommonExceptionEnum.BODY_NOT_MATCH);
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e){
        return ResultBody.error(CommonExceptionEnum.INTERNAL_SERVER_ERROR);
    }
}
