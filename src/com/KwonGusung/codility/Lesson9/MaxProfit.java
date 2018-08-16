package com.KwonGusung.codility.Lesson9;

/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 * @author create2879
 *
 */
public class MaxProfit {
	
	// O(N)
	public static int solution(int[] A) {
		if(A.length == 0) {
			return 0;
		}
		
		int minValue = A[0];
		int maxProfit = 0;
		for(int value : A) {
			if(minValue > value) {
				minValue = value;
			}
			int profit = value - minValue;
			if(maxProfit < profit) {
				maxProfit = profit;
			}
		}
		
		return maxProfit;
	}

	// O(N**2)
	public static int solution2(int[] A) {
		int maxValue = 0;
		for(int i=0; i<A.length-1; i++) {
			for(int j=i+1; j<A.length; j++) {
				int tempValue = A[j] - A[i];
				if(tempValue > maxValue) {
					maxValue = tempValue;
				}
			}
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
		//int[] A = {};
		System.out.println(solution(A));
	}
}
