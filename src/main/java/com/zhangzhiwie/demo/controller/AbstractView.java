package com.zhangzhiwie.demo.controller;

import com.alibaba.fastjson.JSONObject;

public class AbstractView {

    protected JSONObject getResult(Object... o) {
        JSONObject result = new JSONObject();
        result.put("code", 100);
        if (o != null && o.length > 0)
            result.put("data", o[0]);
        result.put("msg", "请求成功");
        return result;
    }

    protected JSONObject getErrResult(String... msg) {
        JSONObject result = new JSONObject();
        result.put("code", 200);
        if (msg != null && msg.length > 0)
            result.put("msg", msg[0]);
        return result;
    }
}
