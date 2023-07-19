package org.mackenzine.hackerrank.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTest {

    @Test
    public void shouldParseNoon() {
        assertEquals("12:01:00", TimeConversion.Result.timeConversion("12:01:00PM"));
    }

    @Test
    public void shouldParsePmTime() {
        assertEquals("19:05:45", TimeConversion.Result.timeConversion("07:05:45PM"));
    }

    @Test
    public void shouldParseAmTime() {
        assertEquals("00:01:00", TimeConversion.Result.timeConversion("12:01:00AM"));
    }

    @Test
    public void shouldParseAmTime2() {
        assertEquals("06:40:03", TimeConversion.Result.timeConversion("06:40:03AM"));
    }

    @Test
    public void shouldParseAmTime3() {
        assertEquals("04:59:59", TimeConversion.Result.timeConversion("04:59:59AM"));
    }
}
