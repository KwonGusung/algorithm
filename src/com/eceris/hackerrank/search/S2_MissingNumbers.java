package com.eceris.hackerrank.search;

// https://www.hackerrank.com/challenges/missing-numbers/problem

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;

public class S2_MissingNumbers {
    public static void main(String[] args) {
//        int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
//        int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] arr = {7, 2, 5, 3, 5, 3};
        int[] brr = {7, 2, 5, 4, 6, 3, 5, 3};

        int[] result = missingNumbers(arr, brr);
        System.out.println(result);
//        204 205 206
    }

    static int[] missingNumbers(int[] arr, int[] brr) {
        Arrays.sort(brr);
        Stack<Integer> temp = new Stack<>();
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(integer -> {
                    temp.push(integer);
                });

        HashSet<Integer> result = new HashSet<>();

        for (int target : brr) {
            if (temp.peek() == target) {
                temp.pop();
            } else {
                result.add(target);
            }
        }
        return result.stream().mapToInt(value -> value.intValue()).toArray();
    }



    static int[] missingNumbers1(int[] arr, int[] brr) {
        Arrays.sort(brr);
        Stack<Integer> temp = new Stack<>();
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(integer -> {
                    temp.push(integer);
                });

        HashSet<Integer> result = new HashSet<>();

        for (int target : brr) {
            if (temp.peek() == target) {
                temp.pop();
            } else {
                result.add(target);
            }
        }
        return result.stream().mapToInt(value -> value.intValue()).toArray();
    }
}
