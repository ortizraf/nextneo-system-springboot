package com.nextneo.system.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SystemApplicationTests.class)
@TestPropertySource(locations="classpath:test.properties")
@ComponentScan(basePackages={"com.nextneo.system.service.*"})
public class SystemApplicationTests {

	@Test
	public void contextLoads() {
	}

}