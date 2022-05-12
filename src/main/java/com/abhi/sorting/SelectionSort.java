package com.abhi.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	private static int[] selectionSort(int[] arr) {

		// complexity in best case as well as worst case is  O(n^2).
		int counter = 0;
		for (int itr = 0; itr < arr.length - 1; itr++) {
			int min = itr;
			for (int j = itr + 1; j < arr.length; j++) {
				counter++;
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[itr];
			arr[itr] = arr[min];
			arr[min] = temp;
		}
		System.out.println("No of iterations " + counter);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		
		selectionSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}

}
