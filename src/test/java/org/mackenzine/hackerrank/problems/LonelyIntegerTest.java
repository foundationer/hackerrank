package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;
import org.mackenzine.hackerrank.problems.LonelyInteger.Result;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LonelyIntegerTest {

    @Test
    public void singleElement() {
        int lonelyInteger = Result.lonelyinteger(List.of(1));

        assertEquals(1, lonelyInteger);
    }

    @Test
    public void multipleElements() {
        int lonelyInteger = Result.lonelyinteger(List.of(1,1,2));

        assertEquals(2, lonelyInteger);
    }

    @Test
    public void multipleElementsWithDuplicates() {
        int lonelyInteger = Result.lonelyinteger(List.of(0,0,1,2,1));

        assertEquals(2, lonelyInteger);
    }
}
