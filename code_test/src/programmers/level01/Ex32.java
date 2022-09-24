package programmers.level01;

import java.util.Arrays;

// 이상한 문자 만들기
public class Ex32 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "try hello world";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public String solution(String s) {
			String answer = "";
			int count = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(count % 2 == 0) answer += s.substring(i, i+1).toUpperCase();
				else answer += s.substring(i, i+1).toLowerCase();
				
				if(s.substring(i, i+1).equals(" ")) count = 0;
				else count++;
			}
			
			return answer;
		}
	}
}
