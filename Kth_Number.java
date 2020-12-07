package com.programmers.test;

import java.util.Arrays;
/*
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
 commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를
  배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
/*
 * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
   [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
   [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다
 */
/*
 * 2차원 배열이 있다. 2차원 배열에서 변수에 변수.length를 구하면 덩어리를 센다. 즉 행의 갯수를 센다
 * 변수의 번지수의 길이를 구하면 변수[0].length는 덩어리 안에 길이 즉 열의 갯수를 센다.
 * 문제엔 [2,5,3] [4,4,1] [1,7,3]
 * 각 행마다 숫자가 리턴이 된다. = commands.length
 * 
 * return의 배열 길이는 commands.length와 같다
 * 
 */
public class Kth_Number {

	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        answer = new int[commands.length];
	        //유동적인 크기를 위해서 문제에 나와있는 수가 아니라 commands.length를 answer에 담아줌
	        // answer = [0,0,0,0,0,0,....];
	        
	       for(int i = 0; i < commands.length; i++) {
	    	   /*
	    	    * [2,5,3] 중에서 열의 첫번째 인덱스
	    	    */
	    	   int start = commands[i][0];
	    	   int end = commands[i][1];
	    	   int k = commands[i][2];
	    	   int[] arr = Arrays.copyOfRange(array, start-1, end);		//번지 수  end의 전까지의 인덱스를 복사해줌.
	    	   Arrays.sort(arr);	//정렬 함수
	    	   answer[i] = arr[k-1];
	    	   // for문을 처음에 돌면 [5,0,0,0,0,0,0,...]
	    	   // i번까지 돈다
	       }
	       	//{5,6,3}
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3}, {4,4,1}, {1,7,3}} )));
	}
}
