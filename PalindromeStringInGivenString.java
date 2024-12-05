package com;

import java.util.Scanner;

public class PalindromeStringInGivenString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = scanner.nextLine();
		String[] word = str.split(" ");

		for (String words : word) {
			if (isPalindrome(words)) {
				System.err.println(words + " ");
			}
		}

	}

	public static boolean isPalindrome(String word) {
		int i1 = 0;
		int i2 = word.length() - 1;

		while (i2 >= i1) {
			if (word.charAt(i1) != word.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;
	}
}
