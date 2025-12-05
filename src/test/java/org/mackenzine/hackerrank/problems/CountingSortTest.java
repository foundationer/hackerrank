package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;
import org.mackenzine.hackerrank.problems.CountingSort.Result;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingSortTest {

    @Test
    public void simpleTest() {
        List<Integer> result = Result.countingSort(List.of(1, 1, 3, 2, 1));

        assertEquals(List.of(0, 3, 1, 1), result.subList(0, 4));
    }
}
