package com.abhi.sorting;

import java.util.Arrays;

public class MergeSort {
	
	private static void merge(int[] left, int[] right, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j] ) {
				arr[k] = left[i];
				i++;
				
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
		
	}

	private static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		
		for (int i=0; i <= mid-1 ; i++) {
			left[i] = arr[i];
		}
		
		for (int i=mid; i <= arr.length-1 ; i++) {
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
		
	}

	public static void main(String[] args) {
		int[] intArray = new int[] { 20, 35, 1, -22, 1 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));

		mergeSort(intArray);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

	}

}
