package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mackenzine.hackerrank.problems.FlippingMatrix.Result.flippingMatrix;

public class FlippingMatrixTest {

    @Test
    public void emptyMatrix() {
        assertEquals(0, flippingMatrix(List.of(List.of())));
    }

    @Test
    public void singleElementMatrix() {
        assertEquals(1, flippingMatrix(List.of(List.of(1))));
    }

    @Test
    public void twoElementMatrix() {
        assertEquals(4, flippingMatrix(List.of(List.of(1, 2), List.of(3, 4))));
    }
}
