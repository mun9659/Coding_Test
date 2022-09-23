package programmers.level01;

import java.util.Arrays;

// 최대공약수와 최소공배수
public class Ex30 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 12;
		int m = 18;
		
		System.out.println(Arrays.toString(s.solution(n, m)));
	}
	
	static class Solution {
		public int[] solution(int n, int m) {
			int[] answer = new int[2];
			int min = 0, max = 0;
			
			// 최대공약수 체크
			for(int i = 1; i <= n; i++) {
				if(n % i == 0 && m % i == 0) {
					max = i;
				}
			}
			
			// 최소공배수 체크
			if(m % n == 0) {
				min = m;
			} else {
				if(max == 1) min = m * n;
				else min = m * n / max;
			}
			
			answer[0] = max;
			answer[1] = min;
			
			return answer;
		}
	}
}
