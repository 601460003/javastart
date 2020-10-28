package com.zhangzhiwie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.EnumMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("星期一", "星期一");
        map.put("2", "星期二");
        System.out.println(map);
        System.out.println(map.get("2"));
        SpringApplication.run(DemoApplication.class, args);
    }

}
