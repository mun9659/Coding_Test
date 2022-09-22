package programmers.level01;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자
public class Ex11 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		long x = 2;
		int n = 5;
		
		System.out.println(Arrays.toString(s.solution(x, n)));
	}
	
	static class Solution {
		public long[] solution(long x, int n) {
			long[] answer = new long[n];
			
			for(int i = 0; i < n; i++) {
				answer[i] = x * (i+1);
			}
			
			return answer;
		}
	}
}
