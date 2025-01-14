package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class MinMaxSumTest {

    @Test
    public void emptyList() {
        MinMaxSum.Result.miniMaxSum(Collections.emptyList());
    }

    @Test
    public void simpleCase() {
        MinMaxSum.Result.miniMaxSum(List.of(1, 2, 3, 4 ,5));
    }

    @Test
    public void smallerList() {
        MinMaxSum.Result.miniMaxSum(List.of(1, 2, 3, 4));
    }

    @Test
    public void bigNumbers() {
        MinMaxSum.Result.miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }
}
