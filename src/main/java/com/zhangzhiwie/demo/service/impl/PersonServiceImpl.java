package com.zhangzhiwie.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhangzhiwie.demo.dao.PersonDao;
import com.zhangzhiwie.demo.entity.Person;
import com.zhangzhiwie.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//创建了controller包，我们还是在com.example.myFirstMaven包下创建一个新的包service，
// 这个包意义表示我们会所以的逻辑都编写在此包下，在service下创建一个PersonService接口和一个impl的包，
// 然后在impl下创建一个PersonServiceImpl的类，此类要实现PersonService接口


@Service //声明一个service 实现接口类
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getList(){
        return personDao.getList();
    }

    @Override
    @Transactional  //表示事务由spring管理的，我们需要收到begin transaction &commit
    public void addPerson(JSONObject person) {
        personDao.addPerson(person);
    }

    @Override
    @Transactional
    public void deletePerson(JSONObject id) {
        personDao.deletePerson(id);
    }

    @Override
    @Transactional
    public void updatePerson(JSONObject person) {
       personDao.updatePerson(person);
    }

    @Override
    public List<Person> getListByParams(JSONObject person){
        return personDao.getListByParams(person);
    }
}
