package com.abhi.sorting;

import java.util.Arrays;

public class InsertionSort {
	// complexity in best case O(n) -> when array is sorted
	// O(n^2) in worst case
	private static int[] insertionSort(int[] arr) {
		
		for(int i = 1; i< arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} else {
					break;
				}
			}

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
