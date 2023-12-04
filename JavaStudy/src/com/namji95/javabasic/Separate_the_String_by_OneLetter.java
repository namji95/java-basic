package com.namji95.javabasic;

public class Separate_the_String_by_OneLetter {
	public static void main(String[] args) {
		String str = "MyString";
		
		// split()
		System.out.println("--------split--------");
		for (String s : str.split("")) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// toCharArray
		System.out.println("--------toCharArray--------");
		for (char c : str.toCharArray()) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		// charAt
		System.out.println("--------charAt--------");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		
		// stream
		System.out.println("--------Stream--------");
		str.chars() // (IntStream)
					.mapToObj(i -> (char) i) // Stream<Character> 으로 변환
					.forEach(i -> System.out.print(i + " ")); // 출력
	}
}
