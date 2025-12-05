package org.mackenzine.hackerrank.problems;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlippingMatrix {

    static class Result {

        /*
         * Complete the 'flippingMatrix' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
         */

        public static int flippingMatrix(List<List<Integer>> matrix) {
            // Write your code here
            if (matrix.isEmpty() || matrix.get(0).isEmpty()) {
                return 0;
            }
            int max = matrix.get(0).get(0);
            int maxI = 0;
            int maxJ = 0;

            for(int i = 0; i < matrix.size(); i++) {
                for(int j = 0; j < matrix.size(); j++) {
                    if (matrix.get(i).get(j) > max) {
                        max = matrix.get(i).get(j);
                        maxI = i;
                        maxJ = j;
                    }
                }
            }
            return max;
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    int n = Integer.parseInt(bufferedReader.readLine().trim());

                    List<List<Integer>> matrix = new ArrayList<>();

                    IntStream.range(0, 2 * n).forEach(i -> {
                        try {
                            matrix.add(
                                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                            .map(Integer::parseInt)
                                            .collect(toList())
                            );
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });

                    int result = Result.flippingMatrix(matrix);

                    bufferedWriter.write(String.valueOf(result));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
