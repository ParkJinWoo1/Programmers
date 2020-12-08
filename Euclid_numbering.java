package com.programmers.test;

import java.util.Arrays;

public class Euclid_numbering {

	 public static int[] solution(int n, int m) {
	        int[] answer = {};
	        answer = new int[2];
	        
	        if(n < m) {		//n m 중 크게 들어 오는 숫자를 m으로 정 할 때,
	        	for(int i = 1; i <= n; i++) {	//n 과 m을 나눠줄 i를 m만큼 돌린다
	        									//for문으로 젤 큰 놈이 i로 반환?
	        		if(n % i == 0 && m % i == 0) {// 둘다 i로 나눠 떨어진 큰 놈
	        			answer[0] = i;			//최대공약수
	        			answer[1] = m*n / i;	//최소공배수
	        		}
	        	}
	        }else {
	        	for(int i = 1; i <= m; i++) {
	        		if(n % i == 0 && m % i == 0) {
	        			answer[0] = i;
	        			answer[1] = m*n / i;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,12)));
	}
}
