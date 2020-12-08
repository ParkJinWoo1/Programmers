package com.programmers.test;

import java.util.Arrays;

public class Budget {

	public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < d.length; i++) {
        	sum += d[i];	//0+1 = 1
        	cnt++;
        	if(sum <= budget) {
        		answer = cnt;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,2,3,3},10));
	}
}
