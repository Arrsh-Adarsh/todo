package com.webapp.todo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoWebAppApplicationTests {

	@Test
	void contextLoads() {
		assertArrayEquals(new int[] {2,4}, new int[] {2,4});
//		assertArrayEquals(new int[] {2,4}, new int[] {2,4,5});
	}

}
