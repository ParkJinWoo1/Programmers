package com.programmers.test;

public class Hashad_number {

	public static boolean solution(int x) {
        boolean answer = true;
        
        int ten = x;		//자릿수 합을 계산 할 때 사용하는 변수
        int sum = 0;		//자릿수의 합
        
        for(int i = 1; i <= x; i++) {
        	
        sum += ten % 10;	//ten=13일 때 , 10으로 나눈 나머지를 sum에 대입
        ten = ten / 10;		//13을 10으로 나눈 몫을 ten에 대입
        }
        
        sum += ten;			//1 + 3 = 4
        if(x%sum == 0) {	//13 % 4 == 0 이라면 true
        	answer = true;
        }else {
        	answer = false;	//그렇지 않으면 false
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(12));
	}
}
