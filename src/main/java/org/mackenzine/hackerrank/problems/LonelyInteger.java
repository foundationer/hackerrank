package org.mackenzine.hackerrank.problems;

import java.io.*;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

    static class Result {

        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static int lonelyinteger(List<Integer> a) {
            Stack<Integer> result = new Stack<>();
            for (int i = 0; i < a.size(); i++) {
                if (result.contains(a.get(i))) {
                    result.remove(a.get(i));
                } else {
                    result.push(a.get(i));
                }
            }
            return result.pop();
        }
    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .toList();

            int result = Result.lonelyinteger(a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
