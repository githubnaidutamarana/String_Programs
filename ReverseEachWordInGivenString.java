package com;

public class ReverseEachWordInGivenString {
	public static void main(String[] args) {
		String s = "java code";

		String[] words = s.split(" ");
		String output = "";
		for (String word : words) {
			String reverseWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				reverseWord += word.charAt(i);

			}
			output += reverseWord+" ";
		}
		System.err.println(output);
	}
}
