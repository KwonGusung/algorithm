package com.KwonGusung.codility.Lesson10;

/**
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
 * @author create2879
 *
 */
public class MinPerimeterRectangle {

	// O(sqrt(N))
	public static int solution(int N) {
		int minCheckVal = 1;
		int maxCheckVal = N;
		int minPerimeter = 2 * (1 + N);
		while(minCheckVal <= maxCheckVal) {
			maxCheckVal = N / minCheckVal;
			if(N % minCheckVal == 0) {
				int perimeter = 2 * (minCheckVal + maxCheckVal);
				if(perimeter < minPerimeter) {
					minPerimeter = perimeter;
				}
			}
			minCheckVal++;
		}
		return minPerimeter;
	}
	
	public static void main(String[] args) {
		int N = 30;
		System.out.println(solution(N));
	}
}
