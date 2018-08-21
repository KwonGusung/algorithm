package com.KwonGusung.codility.Lesson9;

/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
 * @author create2879
 *
 */
public class MaxSliceSum {

	// O(N)
	public static int solution(int[] A) {
		
		if(A.length == 0) {
			return 0;
		}
		
		int previousSum = A[0];
		int sum = A[0];
		for(int i=1; i<A.length; i++) {
			int tempSum = sum + A[i];
			if(tempSum >= sum) {
				if(A[i] > tempSum) {
					sum = A[i];
				} else {
					sum = tempSum;					
				}
			} else {
				if(previousSum <= sum) {
					previousSum = sum;
				}
				if(A[i] > tempSum) {
					sum = A[i];
				} else {
					sum = tempSum;					
				}
			}
		}
		return previousSum > sum ? previousSum : sum;
	}
	
	public static void main(String[] args) {
		int[] A = {3,2,-6,4,0};
		//int[] A = {1000, -1001, 100000};
		//int[] A = {-2, 1};
		//int[] A = {-2, -2};
		//int[] A = {3, -2, 3, -1, 10000};
		//int[] A = {-5,-2,-1,-4};
		System.out.println(solution(A));
	}
}
