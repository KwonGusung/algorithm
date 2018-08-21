package com.KwonGusung.codility.Lesson10;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/
 * @author create2879
 *
 */
public class CountFactors {

	// O(sqrt(N))
	public static int solution(int N) {
		Set<Integer> cdSet = new HashSet<>();

		int minCheckVal = 1;
		int maxCheckVal = N;
		while(minCheckVal <= maxCheckVal) {
			maxCheckVal = N / minCheckVal;
			if(N % minCheckVal == 0) {
				cdSet.add(minCheckVal);
				cdSet.add(maxCheckVal);
			}
			minCheckVal++;
		}
		return cdSet.size();
	}
	
	public static void main(String[] args) {
		//int N = 10;
		int N = 4;
		System.out.println(solution(N));
	}
}
