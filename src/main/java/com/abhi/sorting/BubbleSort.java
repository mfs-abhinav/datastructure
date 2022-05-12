package com.abhi.sorting;

import java.util.Arrays;

public class BubbleSort {
	// complexity in best case O(n) -> when array is sorted, boolean flag will help to achieve this.
	// O(n^2) in worst case
	private static int[] bubbleSort(int[] arr) {
int counter = 0;
		for(int itr = 1; itr < arr.length; itr++) {

			boolean flag = false;
			for(int j=0; j < arr.length - itr; j++) {
				counter++;
				System.out.println("comparing " + arr[j] + " with " + arr[j+1] );
				if(arr[j] > arr[j+1]) {
					System.out.println("swapping " + arr[j] + " with " + arr[j+1]);
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}

			if (! flag) {
				break;
			}
		}
		System.out.println("No of iterations " + counter);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		
		bubbleSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}
}
