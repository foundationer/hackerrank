package org.mackenzine.hackerrank.problems;

import java.util.Scanner;

public class FunnyString {

	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for (int i = 0; i < testCases; i++) {
			String string = scan.next();
			if (funny(string)) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
		scan.close();
	}

	public static String reverse(final String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static boolean funny(final String string) {
		boolean answer = true;
		String reverse = reverse(string);
		for (int i = 1; i < string.length(); i++) {
			int originalFunnyFactor = Math.abs(string.charAt(i) - string.charAt(i - 1));
			int reverseFunnyFactor = Math.abs(reverse.charAt(i) - reverse.charAt(i - 1));
			answer = answer && originalFunnyFactor == reverseFunnyFactor;
		}
		return answer;
	}
}
