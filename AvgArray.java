package com.programmers.test;


public class AvgArray {

	public static double solution(int[] arr) {
        double answer = 0;

        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        return answer / arr.length;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
	}
}
