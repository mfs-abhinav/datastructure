package com.abhi.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	private static int[] insertionSort(int[] arr) {
		
		for(int i=1; i< arr.length; i++) {
			
			int value = arr[i];
			int hole = i;
			
			while(hole > 0 && arr[hole-1] > value) {
				arr[hole] = arr[hole-1];
				hole = hole-1;
			}
			
			arr[hole] = value;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[] { 20, 35, 1, -22, 1 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		
		insertionSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}

}
