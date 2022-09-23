package programmers.level01;

import java.util.regex.Pattern;

// 문자열 다루기 기본
public class Ex25 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String str = "a2345";
		String str = "1234";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public boolean solution(String s) {
			boolean answer = true;
	        
	        if(s.length() == 4 || s.length() == 6) {
	            answer = Pattern.matches("^[0-9]*$", s);
	        } else {
	            answer = false;
	        }
			
			return answer;
		}
	}
}
