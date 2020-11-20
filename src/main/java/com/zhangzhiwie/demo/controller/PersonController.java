package com.zhangzhiwie.demo.controller;

import com.zhangzhiwie.demo.entity.Person;
import com.zhangzhiwie.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController //讲此类声明微web接口
@RequestMapping("person") //路径前缀
public class PersonController {
    @Autowired
    private PersonService personService;

   @GetMapping("index") //声明get请求 浏览器访问地址 http://localhost:8080/person/index
    public String index(){
       return "person index";
   }

   @GetMapping("list")
   public List<Person> getList(){
       return personService.getList();
   }

    @PostMapping("add") //声明post请求 浏览器访问地址 http://localhost:8080/person/index
    public String add(Person person) {
        personService.addPerson(person);
        return "ok";
    }
    @PostMapping("upd") //声明post请求 浏览器访问地址 http://localhost:8080/person/index
    public String updatePerson(Person person) {
        personService.updatePerson(person);
        return "ok";
    }
    @PostMapping("delete") //声明post请求 浏览器访问地址 http://localhost:8080/person/index
    public String deletePerson(Person person) {
        personService.deletePerson(person);
        return "ok";
    }
}
