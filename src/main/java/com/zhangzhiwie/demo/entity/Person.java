package com.zhangzhiwie.demo.entity;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String nationality;
    private Integer sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
