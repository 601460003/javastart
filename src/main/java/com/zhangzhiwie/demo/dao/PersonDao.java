package com.zhangzhiwie.demo.dao;


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
//    @Select("select * from person")
    List<Person> getList();
    //增加数据
    void addPerson(Person person);
    List<Person> getListByParams(Person person);

    //删除数据
    @Delete("delete from person where id = #{id}")
    void deletePerson(Person person);

    //更新数据
    @Update("update person set age = #{age},sex=#{sex},name=#{name} where id=#{id}")
    void updatePerson(Person person);
}



