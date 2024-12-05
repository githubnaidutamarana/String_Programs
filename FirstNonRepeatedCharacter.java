package com;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {

		String s = "ABCSBSCECD";
		
		for (int i = 0; i < s.length(); i++) {

			boolean isPresent = false;
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					isPresent = true;
					break;
				}
			}
			if(isPresent) {
				System.err.println(s.charAt(i));
				break;
			}
		}
		
	}
}
