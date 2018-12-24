package com.virtualpairprogrammers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class PositionreceiverApplicationTests {

	@Test
	public void contextLoads() {
	  assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	}

}
