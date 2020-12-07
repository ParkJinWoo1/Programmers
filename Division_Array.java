package com.programmers.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Division_Array {

	 public static List<Integer> solution(int[] arr, int divisor) {
	        //int[] answer = {};	//answer의 크기가 정해지지 않음, 크기를 정해줘야 함
	        Arrays.sort(arr);
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % divisor == 0) {
					res.add(arr[i]);		
				}
			}
			if(res.size() == 0) {
				res.add(-1);
			}
	        
	        /*
			 * int cnt = 0; for(int i = 0; i < arr.length; i++) { if(arr[i] % divisor == 0)
			 * { answer[cnt] = answer[i]; cnt++;
			 * System.out.println(Arrays.toString(answer)); } } answer = new int[cnt];
			 * 
			 * for
			 */
	        
	        return res;
	    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,6}, 10));
	}
}
