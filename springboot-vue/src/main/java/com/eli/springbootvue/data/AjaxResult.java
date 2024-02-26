/**
 * @(#)AjaxResult.java, 2020/5/24.
 * <p/>
 * Copyright 2020 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.eli.springbootvue.data;


import com.eli.springbootvue.exception.ServiceCode;

import java.util.LinkedHashMap;

/**
 * @author lushuai(lushuai @ corp.netease.com)
 */
public class AjaxResult extends LinkedHashMap<String, Object> {

    public static final String CODE = "code";

    /**
     * 消息
     */
    public static final String MSG = "msg";

    /**
     * 结果
     */
    public static final String RESULT = "result";

    private static final long serialVersionUID = 1L;

    public AjaxResult() {

    }

    public AjaxResult(ServiceCode code) {
        setCode(code);
    }

    public AjaxResult(ServiceCode code, String msg) {
        setCode(code);
        setMsg(msg);
    }

    public AjaxResult(ServiceCode code, Object result) {
        setCode(code);
        setResult(result);
    }

    public static AjaxResult ofSuccess() {
        return new AjaxResult(ServiceCode.SUCCESS);
    }


    public void setCode(ServiceCode code) {
        put(CODE, code.getCode());
    }

    public void setCodeWithMsg(ServiceCode code) {
        put(CODE, code.getCode());
        put(MSG, code.getMsg());
    }

    public void putCode(int code) {
        put(CODE, code);
    }

    public void setResult(Object result) {
        put(RESULT, result);
    }

    public String getMsg() {
        return (String) get(MSG);
    }

    public void setMsg(String msg) {
        put(MSG, msg);
    }

}
