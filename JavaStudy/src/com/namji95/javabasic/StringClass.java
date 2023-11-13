package com.namji95.javabasic;

public class StringClass {
	public static void main(String[] args) {
		/*
		 * String Class에서 제공되는 3가지 메소드 알아보기
		 * 1. contains()
		 * 2. indexOf()
		 * 3. matches()
		 */
		
		String str = "hello Java~";

		System.out.println(str.matches("he"));
		System.out.println(str.matches("(.*)he(.*)"));
		
//		//indexOf (String str)
//		System.out.println(str.indexOf("he"));
//		System.out.println(str.indexOf("Java"));
//		System.out.println(str.indexOf("java"));
//		System.out.println(str.indexOf("~"));
//		
//		//indexOf (int ch)
//		System.out.println(str.indexOf(" "));
//		System.out.println(str.indexOf("J"));
//		
//		//indexOf (int ch, int fromIndex)
//		System.out.println(str.indexOf("o", 6));
//		System.out.println(str.indexOf("o", 4));
		
//		System.out.println(str.contains("he"));
//		System.out.println(str.contains("Java"));
//		System.out.println(str.contains("java"));
//		System.out.println(str.contains("~"));
	}
}
