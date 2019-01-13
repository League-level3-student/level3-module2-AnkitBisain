package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		int[] arr1 = new int[128];
		for(int i = 0; i < 128; i++) {
			arr1[i] = i;
		}
		int[] arr2 = new int[7];
		for(int i = 0; i < 7; i++) {
			arr2[i] = (int) Math.pow(2, i);
		}
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr1 = new int[128];
		for(int i = 0; i < 128; i++) {
			arr1[i] = i;
		}
		int[] arr2 = new int[7];
		for(int i = 0; i < 7; i++) {
			arr2[i] = (int) Math.pow(2, i);
		}
		assertEquals(64,_01_BinarySearch.binarySearch(arr1,0,127,64));
		assertEquals(6,_01_BinarySearch.binarySearch(arr2,0,6,64));

	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr1 = new int[128];
		for(int i = 0; i < 128; i++) {
			arr1[i] = i;
		}
		int[] arr2 = new int[7];
		for(int i = 0; i < 7; i++) {
			arr2[i] = (int) Math.pow(2, i);
		}
		assertEquals(64,_02_InterpolationSearch.interpolationSearch(arr1,64));
		assertEquals(6,_02_InterpolationSearch.interpolationSearch(arr2,64));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr1 = new int[128];
		for(int i = 0; i < 128; i++) {
			arr1[i] = i;
		}
		int[] arr2 = new int[7];
		for(int i = 0; i < 7; i++) {
			arr2[i] = (int) Math.pow(2, i);
		}
		assertEquals(64,_03_ExponentialSearch.exponentialSearch(arr1,64));
		assertEquals(6,_03_ExponentialSearch.exponentialSearch(arr2,64));

	}
}
