package com;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfStringCharacters {
	public static void main(String[] args) {

		String s = "malayalam";

		Map<Character, Integer> map = new HashMap();

		char[] ch = s.toCharArray();

		for (char character : ch) {

			if (!map.containsKey(character)) {
				map.put(character, 1);
			} else {
				int value = map.get(character);
				map.put(character, value+1);
			}
		}
		System.err.println(map);

	}
}
