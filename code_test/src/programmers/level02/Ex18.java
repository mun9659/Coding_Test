package programmers.level02;

// 멀리 뛰기
public class Ex18 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		int n = 2000;
		// int n = 3;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public long solution(int n) {
			long[] dp = new long[2001];
			dp[0] = dp[1] = 1;
			for(int i = 2; i <= n; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
			}
			return dp[n] % 1234567;
		}
	}
}