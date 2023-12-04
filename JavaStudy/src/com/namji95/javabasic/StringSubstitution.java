package com.namji95.javabasic;

public class StringSubstitution {
	public static void main(String[] args) {
		String s = "가나다라마바사";
		String s1 = "가 나 다 라 마 바 사";
		String s2 = "가,나,다,라,마,바,사";
		String str = "aaalllbbblllcccllldddllleee";
		
		// substring()
		System.out.println("substring() : " + s.substring(3));
		System.out.println("substring() : " + s.substring(3, 6));
		
		// split()
		for (String str0 : s.split("라")) {
			System.out.print("split() : " + str0 + " ");
		}
		System.out.println();
		for (String str1 : s1.split(" ")) {
			System.out.print("split() : " + str1 + " ");
		}
		System.out.println();
		String [] str2 = s1.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print("split() : " + str2[i] + " ");
		}
		
		System.out.println();
		// replace()
		System.out.println("replace() : " + s2.replace(",", " "));
		System.out.println("replace() : " + s2.replace(",", ""));
		
		// replaceAll()
		System.out.println("replaceAll() : " + str.replaceAll("[b-c]", "z"));
		
		// replaceFirst()
		System.out.println("replaceFirst() : " + s2.replaceFirst(",", ""));
	}
}
