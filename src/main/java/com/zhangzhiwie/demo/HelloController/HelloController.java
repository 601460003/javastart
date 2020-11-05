package com.zhangzhiwie.demo.HelloController;
import com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    Map home() {
        Map<String, String> map = new HashMap<>();
        map.put("星期一", "星期一");
        map.put("2", "星期二");
        System.out.println(map);
        System.out.println(map.get("2"));
        return map;
    }
     JSONObject getResult() {
        JSONObject result = new JSONObject();
        result.put("code", 100);
        result.put("msg", "请求成功");
        return result;
    }
}

