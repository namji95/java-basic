package com.namji95.javabasic;

import java.util.Arrays;

public class Two_Dimensional_Array {
	/*
	 * 2차원 배열 선언
	 * int[][] arr;
	 * int arr[][];
	 * int[] arr[];
	 * 
	 * 2차원 배열 할당
	 * int[][] arr = new int[][];
	 * 
	 * 2차원 배열 선언과 할당
	 * int[][] arr = new int[][];
	 * int arr[][] = new int[][];
	 * int[] arr[] = new int[][];
	 */
	public static void main(String[] args) {
		// 2차원 배열 선언 예시
		int[][] arr1 = {
			{1,2,3}, // 1행 3열
			{4,5,6}, // 2행 3열
			{7,8,9} // 3행 3열
		};
		int arr2[][] = {
				{10,20},
				{40},
				{70,80,90}
			};
		int[] arr3[] = {
				{100},
				{400,500},
				{700,800,900}
			};
		
		// Arrays의 deepToString을 이용하여 2차원 배열 출력하는 방법
		System.out.println("int[][] arr1 : " + Arrays.deepToString(arr1));
		System.out.println("int[][] arr2 : " + Arrays.deepToString(arr2));
		System.out.println("int[][] arr3 : " + Arrays.deepToString(arr3));
		System.out.println();
		
		// row는 행을, col은 열을 표현하기 위함입니다.
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.print(row + ", " +  col + " | ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2차원 배열 선언과 할당
		int[][] arr5 = new int[3][5];
		
		for (int row = 0; row < arr5.length; row++) {
			for (int col = 0; col < arr5[row].length; col++) {
				System.out.print(row + ", " + col + " | ");
			}
			System.out.println();
		}
		System.out.println();
		
		int arr6[][] = new int[7][5];
		
		for (int row = 0; row < arr6.length; row++) {
			for (int col = 0; col < arr6[row].length; col++) {
				System.out.print(row + ", " + col + " | ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[] arr7[] = new int[3][7];
		
		for (int row = 0; row < arr7.length; row++) {
			for (int col = 0; col < arr7[row].length; col++) {
				System.out.print(row + ", " + col + " | ");
			}
			System.out.println();
		}
	}
}

/*
출력

int[][] arr1 : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
int[][] arr2 : [[10, 20], [40], [70, 80, 90]]
int[][] arr3 : [[100], [400, 500], [700, 800, 900]]

0, 0 | 0, 1 | 0, 2 | 
1, 0 | 1, 1 | 1, 2 | 
2, 0 | 2, 1 | 2, 2 | 

0, 0 | 0, 1 | 0, 2 | 0, 3 | 0, 4 | 
1, 0 | 1, 1 | 1, 2 | 1, 3 | 1, 4 | 
2, 0 | 2, 1 | 2, 2 | 2, 3 | 2, 4 | 

0, 0 | 0, 1 | 0, 2 | 0, 3 | 0, 4 | 
1, 0 | 1, 1 | 1, 2 | 1, 3 | 1, 4 | 
2, 0 | 2, 1 | 2, 2 | 2, 3 | 2, 4 | 
3, 0 | 3, 1 | 3, 2 | 3, 3 | 3, 4 | 
4, 0 | 4, 1 | 4, 2 | 4, 3 | 4, 4 | 
5, 0 | 5, 1 | 5, 2 | 5, 3 | 5, 4 | 
6, 0 | 6, 1 | 6, 2 | 6, 3 | 6, 4 | 

0, 0 | 0, 1 | 0, 2 | 0, 3 | 0, 4 | 0, 5 | 0, 6 | 
1, 0 | 1, 1 | 1, 2 | 1, 3 | 1, 4 | 1, 5 | 1, 6 | 
2, 0 | 2, 1 | 2, 2 | 2, 3 | 2, 4 | 2, 5 | 2, 6 | 


 */