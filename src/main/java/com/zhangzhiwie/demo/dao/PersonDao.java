package com.zhangzhiwie.demo.dao;


import com.alibaba.fastjson.JSONObject;
import com.zhangzhiwie.demo.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 以查询Person表为例
 * #{}符号替代符号。
 */
@Component //将此类交给spring
@Mapper  //声明这是一个mybatis访问数据库的接口
public interface PersonDao {
    //查询语句
     List<Person> getList();
    //增加数据
    void addPerson(JSONObject person);

    //更新数据
    void updatePerson(JSONObject person);

    //删除数据
    void deletePerson(JSONObject id);

    //根据条件查询
    List<Person> getListByParams(JSONObject person);
}



