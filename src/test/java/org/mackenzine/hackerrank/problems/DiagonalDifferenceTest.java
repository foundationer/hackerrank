package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;
import org.mackenzine.hackerrank.problems.DiagonalDifference.Result;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void simpleTest() {
        int diagonalDifference = Result.diagonalDifference(List.of(List.of(1)));
        assertEquals(0, diagonalDifference);
    }
}
