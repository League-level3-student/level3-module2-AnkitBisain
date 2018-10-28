package _00_Sorting_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		assertArrayEquals(y, swapArrayOfTwo(x));

		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		assertArrayEquals(q, sortIntArray(z));

		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static int[] swapArrayOfTwo(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[0] = arr[1];
		newArr[1] = arr[0];
		return newArr;
	}

	public static int[] swapArrayTwo(int[] arr, int index) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[index] = arr[index + 1];
		newArr[index + 1] = arr[index];
		return newArr;
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static int[] sortIntArray(int[] arr) {
		for (int i = 0; i < (arr.length) * (arr.length); i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr = swapArrayTwo(arr, j);
				}
			}
		}
		return arr;
	}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		int i = (arr.length - 1) / 2;
		int mid = sortIntArray(arr)[i];
		return mid;
	}
}
