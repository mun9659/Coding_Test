package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순으로 배치하기
public class Ex24 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String str = "Zbcdefg";
		String str = "AbCdEfGh";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public String solution(String s) {
			String[] chk = s.split("");
			
			Arrays.sort(chk, Collections.reverseOrder());
			
			String answer = String.join("", chk);
			
			return answer;
		}
	}
}
