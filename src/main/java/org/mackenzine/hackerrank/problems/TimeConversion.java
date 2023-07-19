package org.mackenzine.hackerrank.problems;

import java.io.*;

public class TimeConversion {

    static class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            String withoutSuffix = s.substring(0, s.length() - 2);
            String[] parts = withoutSuffix.split(":", 3);
            int hours = Integer.parseInt(parts[0]);
            if (s.endsWith("PM")) {
                int newHours = (hours == 12) ? hours : hours + 12;
                return String.format("%02d", newHours) + ":" + parts[1] + ":" + parts[2];
            } else if (s.endsWith("AM")){
                int newHours = (hours == 12) ? 0 : hours;
                return String.format("%02d", newHours) + ":" + parts[1] + ":" + parts[2];
            }
            return "";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
