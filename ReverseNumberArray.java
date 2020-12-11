package com.programmers.test;

import java.util.Arrays;

public class ReverseNumberArray {

	 public static int[] solution(long n) {
	        int[] answer = {};
	        String s = "" + n;	//Integer.toString이랑 같은 느낌
	        System.out.println(s);//12345 출력
	        answer = new int[s.length()];	//answer배열 길이 초기화
	        int i = 0;	//answer index를 나타내줄 변수
	        
	        while(n > 0) {	//n이 파라미터로 값이 들어온다면
	        	answer[i] = (int)(n%10);	//12345를 10으로 나눠 떨어진 값을 i번지 마다 입력
	        	System.out.println(Arrays.toString(answer));
	        	n /= 10;	//1234가 처음에 남음, while문이 돌 때마다 10으로 나눈 몫 반환
	        	i++;		//인덱스 +1씩
	        }
	        
	        
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
}
