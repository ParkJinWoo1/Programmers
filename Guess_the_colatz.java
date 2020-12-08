package com.programmers.test;

public class Guess_the_colatz {

	public static long solution(long num) {
	    
	    for(int i = 0; i < 500; i++) {
	    	if(num == 1) {
	    		return i;
	    	}
	    	if(num % 2 == 0) {
	    		num /= 2;
	    	}else {
	    		num = (num*3)+1;
	    	}
	    }
	    return -1;  
	}
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
}
