package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mackenzine.hackerrank.problems.FindTheMedian.Result.findMedian;

public class FindTheMedianTest {

    @Disabled("Work in progress")
    @Test
    public void xxxx() {
        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.add(2);
        input.add(4);
        input.add(6);
        input.add(5);
        input.add(3);

        assertEquals(3, findMedian(input));
    }
}
