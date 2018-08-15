package com.KwonGusung.codility.Lesson8;

import java.util.HashMap;
import java.util.Map;

/**
 * https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 * @author create2879
 *
 */
public class EquiLeader {

	public static int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();
		
		int leader = -1;
		for(int i=0; i<A.length; i++) {
			Integer mValue = map.get(A[i]);
			if(mValue == null) {
				map.put(A[i], 1);
			} else {
				map.put(A[i], ++mValue);				
			}
			
			if(map.get(A[i]) > (A.length / 2)) {
				leader = A[i];
			}
		}
		
		if(leader == -1) {
			return 0;
		} else {
			int lLeaderCount = 0;
			int rLeaderCount = map.get(leader);
			int returnCount = 0;
			
			for(int i=0; i<A.length; i++) {
				int lsize = i + 1;
				int rsize = A.length - lsize;
				
				if(A[i] == leader) {
					lLeaderCount++;
					rLeaderCount--;
				}
				if(lLeaderCount > (lsize / 2) && rLeaderCount > (rsize / 2)) {
					returnCount++;
				}
				
			}
			
			return returnCount;
		}
	}
	
	public static void main(String[] args) {
		//int[] A = {4,3,4,4,4,2};
		//int[] A = {0, 0};
		int[] A = {1, 2};
		System.out.println(solution(A));
	}
}
