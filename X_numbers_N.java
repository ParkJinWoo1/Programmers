package com.programmers.test;

import java.util.Arrays;

public class X_numbers_N {

	public static long[] solution(int x, int n) {
        long[] answer = {};
        long sum = 0;
        answer = new long[n];
        
        for(int i = 0; i < n ; i++) {
        	sum += x;
        	answer[i] += sum;
        	
        }
      
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(-4,2)));
	}
}
