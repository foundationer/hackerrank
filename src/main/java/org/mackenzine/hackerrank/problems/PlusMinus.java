package org.mackenzine.hackerrank.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {

    static class Result {

        public static void plusMinus(List<Integer> arr) {
            long positives = arr.stream().filter(integer -> integer > 0).count();
            long zeros = arr.stream().filter(integer -> integer == 0).count();
            long negatives = arr.stream().filter(integer -> integer < 0).count();

            int denominator = arr.size();

            System.out.printf("%.6f", (float) positives / denominator).println();
            System.out.printf("%.6f", (float) negatives / denominator).println();
            System.out.printf("%.6f", (float) zeros / denominator).println();
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
