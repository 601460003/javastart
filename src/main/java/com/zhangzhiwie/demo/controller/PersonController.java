package com.zhangzhiwie.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhangzhiwie.demo.entity.Person;
import com.zhangzhiwie.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController //讲此类声明微web接口
@RequestMapping("person") //路径前缀
public class PersonController extends AbstractView{
    @Autowired
    private PersonService personService;

    @GetMapping("list")
    public JSONObject getList() {
        return getResult(personService.getList());
    }

    @PostMapping("add")
    public JSONObject add(@RequestBody JSONObject person) {
        personService.addPerson(person);
        return getResult(person);
    }

    @PostMapping("upd")
    public JSONObject updatePerson(@RequestBody JSONObject person) {
        personService.updatePerson(person);
        return getResult();
    }
    @PostMapping("delete")
    public JSONObject deletePerson(@RequestBody JSONObject id) {
        personService.deletePerson(id);
        return getResult();
    }

    @PostMapping("getListByParams")
    public JSONObject getListByParams(@RequestBody JSONObject person) {
        return getResult(personService.getListByParams(person));
    }
}
