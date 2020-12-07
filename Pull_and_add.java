package com.programmers.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Pull_and_add {

	public static int[] solution(int[] numbers) {
		HashSet<Integer> hst = new HashSet<Integer>();
		//HashSet Collection을 사용하면 중복 제거 가능
		
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		int sum = numbers[i] + numbers[j];
        		hst.add(sum);
        		//HashSet변수에 인덱스마다 더한 값을 add
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(hst);
        //List타입 변수에 HashSet결과 값을 넣어줌
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5,3,2,1,7})));
	}
}
