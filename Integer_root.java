package com.programmers.test;

public class Integer_root {

	/*
	 * Math.pow(n, m) => n을 m제곱 한 값 
	 */
	 public static long solution(long n) {
	        
	        
	        for(long i = 1; i <= Math.pow(n, 0.5); i++) {
	        	if(n/i == i && n % i == 0) {
	        		
	        		 return (i+1) * (i+1);
	        	}
	        }
	       
	        return -1;
	    }
	public static void main(String[] args) {
		System.out.println(solution(121));
	}
}
