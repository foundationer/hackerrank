package org.mackenzine.hackerrank.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    static class Result {

        /*
         * Complete the 'fizzBuzz' function below.
         *
         * The function accepts INTEGER n as parameter.
         */
            // Write your code here

        public static void fizzBuzz(int n) {
            for (int i = 1; i <= n; i++) {
                int mod3 = i % 3;
                int mod5 = i % 5;
                if( mod3 == 0 && mod5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (mod3 == 0 && mod5 != 0) {
                    System.out.println("Fizz");
                } else if (mod3 != 0 && mod5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Result.fizzBuzz(n);

            bufferedReader.close();
        }
    }
}
