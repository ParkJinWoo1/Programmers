package com.programmers.test;

public class StringNormal {
/*
 * 여림이누나 도움을 받았다...
 * 한번 더 다시 풀어라...
 * */
	 public static boolean solution(String s) {
	        boolean answer = true;
	        char c1;
	        if(s.length() == 4 || s.length() == 6) {
	        	
		        for(int i = 0; i < s.length(); i ++) {
		        	c1 = s.charAt(i);
		        	if(c1 < 48 || c1 > 58) {
		        		answer = false;
		        	}
		        }
	        }else {
	        	return false;
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		System.out.println(solution("a234"));
	}
}
