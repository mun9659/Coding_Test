package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

// 정수 내림차순으로 배치하기
public class Ex09 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		long n = 118372;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public long solution(long n) {
			
			String num = String.valueOf(n);
			String[] num_arr = num.split("");
			
			Arrays.sort(num_arr, Collections.reverseOrder());
			
			num = String.join("", num_arr); // 문자열 연결하는 법
			
			Long answer = Long.parseLong(num);
			
			return answer;
		}
	}
}
