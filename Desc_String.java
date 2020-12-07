package com.programmers.test;

import java.util.Arrays;
import java.util.Collections;

public class Desc_String {

	  public static String solution(String s) {
	        String answer = "";
	        String [] arr = s.split("");	//String 배열 변수를 하나 생성해서 ""별로 짜른 문자열을 넣어줌
	        Arrays.sort(arr);				//짜른 애들을 정렬
	        Collections.reverse(Arrays.asList(arr));	//역순 정렬과 대소문자 구분을 해주는 함수 사용
	        //System.out.println(Arrays.toString(arr));
	        //[g,f,e,d,c,b,Z]
	        answer = String.join("", arr);	//return 해줄 변수에
	        								//String.join메서드를 사용하여
	        					//각 요소 사이에 지정된 구분 기호를 사용하여 문자열 배열의 모든 요소를 연결합니다.
	        return answer;
	    }
	
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
