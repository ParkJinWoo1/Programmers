package com.programmers.test;

public class ChangeInteger {

	  public static int solution(String s) {
	        int answer = 0;
	        if(s.length() >= 1 && s.length() <=5) {
	        	answer = Integer.parseInt(s);
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(solution("-1234"));
	}
}
