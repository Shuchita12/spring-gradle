package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static void main(String args[])
	{
       contextLoads();
	}

	@Test
	public static void contextLoads() {
		System.out.println("This is Test");
	}

}
