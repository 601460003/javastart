package com.zhangzhiwie.demo;

import com.zhangzhiwie.demo.dao.PersonDao;
import com.zhangzhiwie.demo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	//依赖注入 spring的主要特性
	@Autowired
	PersonDao personDao;
	@Test
	public void getPersonList(){
		Person person = new Person();
		person.setName("小马");
		System.out.println(personDao.getListByParams(person));
	}
	@Test
	public void addPerson(){
		Person person = new Person();
		person.setAge(20);
		person.setName("小m毛");
		person.setNationality("美国");
		personDao.addPerson(person);
		System.out.println(personDao.getList());
	}
	@Test
	public void addPerson2(){
		Person person = new Person();
		person.setAge(22);
		person.setName("CESS");
		person.setSex(2);
		personDao.addPerson(person);
		System.out.println(personDao.getList());
	}

	@Test
	public void deletePerson(){
		Person person = new Person();
		person.setId(1);
		personDao.deletePerson(person);
	}

	@Test
	public void updatePerson(){
		Person person = new Person();
		person.setId(3);
		person.setAge(33);
		person.setName("ZHANGZHIWEI	");
		person.setSex(2);
		personDao.updatePerson(person);
	}
}
