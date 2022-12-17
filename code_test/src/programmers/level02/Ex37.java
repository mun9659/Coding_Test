package programmers.level02;

import java.util.Arrays;

// 2 * n 타일링
public class Ex37 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		int n = 4;
		
		System.out.println(sol.solution(n));
	}
	
	public static class Solution {
		 public int solution(int n) {
			 int[] dp = new int[n + 1];
			 dp[0] = dp[1] = 1;
			 for(int i = 2; i <= n; i++) {
				 dp[i] = (dp[i - 1]  + dp[i - 2]) % 1000000007;
			 }
			 
			 return dp[n] % 1000000007;
	    }
	}
}
