package programmers.level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 짝수와 홀수
public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution s = new Solution();
		int num = br.read();
		
		System.out.println(s.solution(num));
	}
	
	static class Solution {
		public String solution(int num) {
			String answer = "";
			
			if(num % 2 == 0) answer += "Even";
			else answer += "Odd";
			
			return answer;
		}
	}
}


