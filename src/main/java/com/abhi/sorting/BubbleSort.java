package com.abhi.sorting;

import java.util.Arrays;

public class BubbleSort {
	private static int[] bubbleSort(int[] arr) {
		
		for(int i=0; i< arr.length-1; i++) {
			
			boolean flag = false;
			for(int j=0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {

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
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[] { 20, 35, 1, -22, 1 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		
		bubbleSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}
}
