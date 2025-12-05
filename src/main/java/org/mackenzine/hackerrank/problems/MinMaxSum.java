package org.mackenzine.hackerrank.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSum {

    static class Result {

        static private final Logger LOGGER = LoggerFactory.getLogger(Result.class);

        public static void miniMaxSum(List<Integer> arr) {
            if (arr.size() == 5) {
                long min = arr.stream().mapToInt(i -> i).min().orElseThrow();
                long max = arr.stream().mapToInt(j -> j).max().orElseThrow();
                long sum = arr.stream().mapToLong(k -> k).reduce(Long::sum).orElseThrow();

                System.out.printf("%d", (sum - max));
                System.out.printf(" %d", (sum - min));
            } else {
                LOGGER.error("Unexpected list size");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
