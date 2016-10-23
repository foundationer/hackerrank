package org.mackenzine;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
