package com.revature.fsd.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUtil {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}

	@Test
	void testAverageStudent1() {
		assertEquals(false, Util.isAverageStudent(25));
	}
	
	@Test
	void testAverageStudent2() {
		assertTrue(Util.isAverageStudent(60));
	}

	@Test
	void testAverageStudent3() {
		assertTrue(Util.isAverageStudent(65));
	}

	@Test
	void testAverageStudent4() {
		assertTrue(Util.isAverageStudent(75));
	}

	@Test
	void testAverageStudent5() {
		assertFalse(Util.isAverageStudent(80));
	}

}
