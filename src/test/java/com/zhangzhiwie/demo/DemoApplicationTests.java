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
}
