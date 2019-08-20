package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.DemoController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	DemoController demoController;

	@Test
	public void exampleTest()
	{
		String result=demoController.example();
		
		Assert.assertEquals(result, "HELLO-WORLD");
		
	}
	@Test
	public void exampleTest2()
	{
		String result=demoController.example();
		
		Assert.assertNotEquals(result, "HELLO");
		
	}
	
	
}
