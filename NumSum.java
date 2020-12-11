package com.programmers.test;

import java.util.Arrays;

public class NumSum {

	public static int solution(int n) {
        int answer = 0;
        String s = ""+n;
        System.out.println(s);
        int[] res = new int[s.length()];
        int i = 0;
        while(n > 0) {
        	res[i] = (int)(n%10);
        	//System.out.println(Arrays.toString(res));
        	n /= 10;
        	i++;
        }
        for(int j = 0; j < res.length; j++) {
        	answer += res[j];
        	
        }
        

        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(123));
	}
}
