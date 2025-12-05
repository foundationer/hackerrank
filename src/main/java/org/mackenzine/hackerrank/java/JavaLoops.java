package org.mackenzine.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class JavaLoops {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.rangeClosed(1, 10).forEach(i -> {
            System.out.println(N + " x " + i + " = " + N * i);
        });

        bufferedReader.close();
    }
}
