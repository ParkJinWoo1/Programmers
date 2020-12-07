package com.programmers.test;

import java.util.Arrays;

public class Matrix_addition {

	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];
        		// [][] => 앞 대괄호는 행 , 뒤 대괄호는 열
       
       for(int i = 0; i<arr1.length; i++) {
    	  for(int j = 0; j<arr1[i].length; j++) {
    		  int sum = arr1[i][j] + arr2[i][j];	// 1+3 = 4
    		  answer[i][j] = sum; 
    		  System.out.println(Arrays.deepToString(answer));
    	  }
       }
       
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}})));
	}
}
