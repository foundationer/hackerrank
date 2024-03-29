package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;
import org.mackenzine.hackerrank.problems.FunnyString;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FunnyStringTest {

	@Test
	public void testFunny() {
		assertTrue(FunnyString.funny("acxz"));
	}

	@Test
	public void testNotFunny() {
		assertFalse(FunnyString.funny("bcxz"));
	}
}
