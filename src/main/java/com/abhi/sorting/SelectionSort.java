package com.abhi.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	private static int[] selectionSort(int[] arr) {
		
		for(int i=0; i< arr.length-1; i++) {
			int min = i;
			
			for(int j=i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[] { 20, 35, 1, -22, 1 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		
		selectionSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}

}
