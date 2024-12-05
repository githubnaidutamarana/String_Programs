package com;

import java.util.HashSet;
import java.util.Set;

public class RemovieDuplicateCharacterInGivenString {
	public static void main(String[] args) {
		String s = "Programming";

		// Approach-1
		StringBuilder sb = new StringBuilder();
		s.chars().distinct().forEach(c -> sb.append((char) c));
		System.err.println(sb);

		// Approach-2
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int idx = s.indexOf(ch, i + 1);
			if (idx == -1) {
				sb1.append(ch);
			}
		}
		System.err.println(sb1);

		// Approach-3
		char[] str = s.toCharArray();

		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			boolean isPresent = false;
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				sb2.append(str[i]);
			}
		}
		System.err.println(sb2);

		// Approach-4
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new HashSet();

		for (int i = 0; i < s.length(); i++) {

			set.add(s.charAt(i));
		}
		for (Character c : set) {
			sb3.append(c);
		}

		System.err.println(sb3);
	}
}
