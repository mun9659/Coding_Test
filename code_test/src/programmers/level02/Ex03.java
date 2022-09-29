package programmers.level02;

import java.util.Arrays;

// JadenCase 문자열 만들기
public class Ex03 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "1111111";
		// String str = "for the last week";
		
		System.out.println(Arrays.toString(s.solution(str)));
	}
	
	static class Solution {
		public int[] solution(String s) {
			// 1. x의 모든 0을 제거합니다.
			// 2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
			int[] answer = new int[2];
			String result = s;
			int cnt = 0, zero_cnt = 0;
			while(!result.equals("1")) {
				String chk = "";
				// 좀 무식한 방법이었음(어떤 케이스는 532ms 걸림, s의 길이가 150,000 이하까지 표현하기에 너무 무식한 방법)
				/*
				for(int i = 0; i < result.length(); i++) {
					if(result.charAt(i) == '1') chk += result.charAt(i);
					if(result.charAt(i) == '0') zero_cnt++;
				}
				*/
				for(int i = 0; i < result.length(); i++) {
					if(result.charAt(i) == '0') zero_cnt++;
				}
				chk = result.replaceAll("0", "");
				
				result = Integer.toBinaryString(chk.length()) ;
				cnt++;
				System.out.println(result);
			}
			
			answer[0] = cnt;
			answer[1] = zero_cnt;
			
			return answer;
		}
	}
}


