package com.programmers.test;

import java.util.Arrays;
import java.util.Collections;

public class Desc_Integer {

	public static long solution(long n) {
        long answer = 0;
        int l = Long.toString(n).split("").length;	//길이를 담을 변수
        System.out.println(l);						//길이
        
        String[] s = new String[l];					//string 배열 변수 길이 지정
        s = Long.toString(n).split("");				//""로 들어오는걸 잘라서 넣어줌
        Arrays.sort(s, Collections.reverseOrder());	//정렬을 내림차순으로 해주는 함수 사용
        System.out.println(Arrays.toString(s));		//[8,7,3,2,1,1]
        
        String temp = "";						//s[i]마다 값을 string으로 더해주기 위해 선언
        for(int i = 0; i < s.length; i++) {
        	temp += (long)Long.parseLong(s[i]);	//인덱스마다 숫자로 받지 않고 string으로 받아 줌
        	System.out.println(temp);
        }
        answer = Long.parseLong(temp);			//temp변수에 담겨진걸 long타입으로 변환 후 넣어줌
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
}
