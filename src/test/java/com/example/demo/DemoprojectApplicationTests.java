package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.annotation.ComponentScan;
@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages={"com.example"})

public class DemoprojectApplicationTests {

	@Test
	public void contextLoads() {
	}

}
