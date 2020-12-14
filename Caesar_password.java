package com.programmers.test;

public class Caesar_password {

	public static String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
        	char x = s.charAt(i);
        	if(Character.isLowerCase(x)) {
        		x = (char)((x+ n%26 - 'a') %26 + 'a');
        		System.out.println(x);
        	}else if(Character.isUpperCase(x)){
        		x = (char)((x + n%26 - 'A')%26 + 'A');
        		//System.out.println(x);
        	}
        	answer += x;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("a B z", 4));
	}
}
