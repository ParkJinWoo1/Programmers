package com.programmers.test;

public class Count_P_Y {

	public static boolean solution(String s) {
	      boolean answer = true;
	      int cnt1 = 0;
	      int cnt2 = 0;
	      
	      for(int i = 0 ; i < s.length(); i++) {
	    	  char c1 = s.toUpperCase().charAt(i);
	    	  if(c1 == 'P') {
	    		  cnt1 ++;
	    	  }
	    	  if(c1 == 'Y') {
	    		  cnt2 ++;
	    	  }
	    	  if(!s.toUpperCase().contains("Y") && !s.toUpperCase().contains("P")) {
	    		  return true;
	    	  }
	      }
	      if(cnt1 == cnt2) {
	    	  return answer;
	      }else {
	    	  return false;
	      }
	    

	        
	    }
	
	public static void main(String[] args) {
		
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println(solution("pPoooyY"));
	}
	
	
}
