package com.programmers.test;

import java.util.Arrays;

public class MinimumDelete {

	 public static int[] solution(int[] arr) {
	        int[] answer = {};
	        int length = arr.length;	//배열 길이 나타내는 변수
	        int x = 0;					//answer 배열 인덱스 표현 변수
	        int min = arr[0];			//제일 작은 수를 넣을 변수 설정하여 arr[0]으로 초기화
	       
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] < min) {	//min의 처음값은 arr[0]이며 arr.length만큼
	        						//돌 때까지 작은수를 비교하여 변수에 작은수를 넣어줌
	        		min = arr[i];
	        	}
	        }
	        
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] == min) {		//작은 수라면 길이에 -1을 줌
	        							//제거해야 하니깐
	        		length--;
	        	}
	        }
	        
	        if(length == 0) {	//길이가 0일 경우 answer배열에 -1값을 넣어줌
	        	answer = new int[1];
	        	answer[0] = -1;
	        }else {			//길이가 0이 아닐 경우, arr배열에서 최솟값과 다른 값을 가지고 있다면
	        				//answer 배열에 넣어주고 x를 1 증가 시켜줌
	        	answer = new int[length];
	        	for(int i = 0; i < arr.length; i++) {
	        		if(arr[i] != min) {
	        			answer[x] = arr[i];
	        			x++;
	        		}
	        	}
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int [] {4,3,2,1})));
	}
}
