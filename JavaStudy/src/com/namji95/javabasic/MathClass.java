package com.namji95.javabasic;

public class MathClass {
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(9)); // 3.0
		System.out.println(Math.sqrt(25)); // 5.0
		
		System.out.println(Math.cbrt(8)); // 2.0
		System.out.println(Math.cbrt(64)); // 4.0
		
		System.out.println(Math.pow(3, 3)); // 27.0
		System.out.println(Math.pow(3, 7)); // 2187.0
		
		System.out.println(Math.scalb(2, 4)); // 32.0
		
		System.out.println(Math.hypot(3, 4)); // 5.0
		
		System.out.println(Math.round(3.3)); // 3
		System.out.println(Math.round(7.7)); // 8
		
		System.out.println(Math.rint(7.77)); // 8.0
		System.out.println(Math.rint(-3.33)); // -3.0
		
		System.out.println(Math.ceil(3.33)); // 4.0
		System.out.println(Math.ceil(-7.77)); // -7.0
		
		System.out.println(Math.floor(3.33)); // 3.0
		System.out.println(Math.floor(-3.33)); // -4.0
		
		System.out.println(Math.min(77, 7)); // 7
		System.out.println(Math.min(-77, 7)); // -77
		System.out.println(Math.max(77, 7)); // 77
		System.out.println(Math.max(-77, 7)); // 7
		
		System.out.println(Math.abs(7)); // 7
		System.out.println(Math.abs(-7)); // 7
		System.out.println(Math.signum(7)); // 1.0
		System.out.println(Math.signum(-7)); // -1.0
		
	}
}
