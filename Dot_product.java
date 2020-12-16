package com.programmers.test;


public class Dot_product {
	public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        int sum = 0;
        
        for(int i = 0; i < a.length; i++) {
        	//System.out.println(a[i]);
        	//System.out.println(b[i]);
        	sum = a[i] * b[i];
        	answer += sum;
        }
       
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));
	}
}
