package com.programmers.test;
public class Strange_character {

	public static String solution(String s) {
        String answer = "";
        String[] x = s.split("");
        int cnt = 0;
        for(int i = 0; i < x.length; i++) {
        	if(x[i].equals(" ")) {
        		cnt = 0;
        	}else {
        		if(cnt % 2 == 0) {
        			cnt++;
        			x[i] = x[i].toUpperCase();
        		}else {
        			cnt++;
        			x[i] = x[i].toLowerCase();
        		}
        	}
        	answer += x[i];
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
}
