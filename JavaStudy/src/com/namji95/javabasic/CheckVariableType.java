package com.namji95.javabasic;

import java.util.ArrayList;
import java.util.List;

public class CheckVariableType {
	public static void main(String[] args) {
		/*
		 * 확인 방법
		 * getClass().getName();
		 * getClass().getTypeName();
		 * getClass().getSimpleName();
		 * isInstance();
		 * typeOf
		 */
		
//		계속 사용할 변수
//		int i = 0;
//		double d = 1.0;
//		Integer I = 0;
//		String s = "";
//		Boolean b = true;
//		List<String> list1 = new ArrayList<String>();
//		List<Integer> list2 = new ArrayList<Integer>();
		
//		getClass().getName(); 이 메소드는 객체만 호출할 수 있습니다.
//		System.out.println("getClass().getName(); : " + ((Object) i).getClass().getName());
//		System.out.println("getClass().getName(); : " + ((Object) d).getClass().getName());
//		System.out.println("getClass().getName(); : " + I.getClass().getName());
//		System.out.println("getClass().getName(); : " + s.getClass().getName());
//		System.out.println("getClass().getName(); : " + b.getClass().getName());
//		System.out.println("getClass().getName(); : " + list1.getClass().getName());
//		System.out.println("getClass().getName(); : " + list2.getClass().getName());
		
//		getClass().getTypeName(); 이 메소드는 객체만 호출할 수 있습니다.
//		System.out.println("getClass().getTypeName(); : " + ((Object) i).getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + ((Object) d).getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + I.getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + s.getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + b.getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + list1.getClass().getTypeName());
//		System.out.println("getClass().getTypeName(); : " + list2.getClass().getTypeName());

//		getClass().getSimpleName(); 이 메소드는 객체만 호출할 수 있습니다.
//		System.out.println("getClass().getSimpleName() : " + ((Object) i).getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + ((Object) d).getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + I.getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + s.getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + b.getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + list1.getClass().getSimpleName());
//		System.out.println("getClass().getSimpleName() : " + list2.getClass().getSimpleName());
		
//		System.out.println(Integer.class.isInstance(i));
//		System.out.println(Double.class.isInstance(d));
//		System.out.println(Integer.class.isInstance(I));
//		System.out.println(String.class.isInstance(s));
//		System.out.println(Boolean.class.isInstance(b));
//		System.out.println(ArrayList.class.isInstance(list1));
//		System.out.println(ArrayList.class.isInstance(list2));
		
		int i1 = 0;
		long l1 = 0;
		float f1 =  0f;
		double d1 = 0;
		boolean b1 = true;
		
		System.out.println("type : " + type.typeOf(i1));
		System.out.println("type : " + type.typeOf(l1));
		System.out.println("type : " + type.typeOf(f1));
		System.out.println("type : " + type.typeOf(d1));
		System.out.println("type : " + type.typeOf(b1));
	}
}
class type {
	public static Class<Integer> typeOf (final int expr) {
		return Integer.TYPE;
	}
	public static Class<Long> typeOf (final long expr) {
		return Long.TYPE;
	}
	public static Class<Float> typeOf (final float expr) {
		return Float.TYPE;
	}
	public static Class<Double> typeOf (final double expr) {
		return Double.TYPE;
	}
	public static Class<Boolean> typeOf (final boolean expr) {
		return Boolean.TYPE;
	}
}
