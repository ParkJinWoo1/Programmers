package com.programmers.test;



public class Find_Kim {
	
	public static String solution(String[] seoul) {
		String answer = "";
		
		for(int i = 0; i < seoul.length; i++) {
			//System.out.println(i + "번지" + seoul[i]);
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다"; 
			}
		
		}
		
		return answer;
	}
	


	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"Jane", "Kim"}));

	}
}
