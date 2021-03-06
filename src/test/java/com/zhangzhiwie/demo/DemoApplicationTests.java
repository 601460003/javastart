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
		System.out.println(personDao.getList());
	}
	@Test
	public void addPerson(){
		Person person = new Person();
		person.setAge(20);
		person.setName("小金99");
		person.setNationality("美国");
		personDao.addPerson(person);
		System.out.println(personDao.getList());
	}
	@Test
	public void deletePerson(){
		Person person = new Person();
		person.setId(10);
		personDao.deletePerson(person);
	}

	@Test
	public void updatePerson(){
		Person person = new Person();
		person.setName("小金");
		person.setAge(22);
		person.setNationality("美国");
		personDao.updatePerson(person);
	}
}
