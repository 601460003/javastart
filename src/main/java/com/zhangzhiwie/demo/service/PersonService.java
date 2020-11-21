package com.zhangzhiwie.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.zhangzhiwie.demo.entity.Person;

import java.util.List;

public interface PersonService {
    //获取所有
    List<Person> getList();

    //插入一条数据
    void addPerson(JSONObject person);

    //删除数据
    void deletePerson(JSONObject id);

    //跟新数据
    void updatePerson(JSONObject person);

    //根据条件查询数据库
    List<Person> getListByParams(JSONObject person);
}
