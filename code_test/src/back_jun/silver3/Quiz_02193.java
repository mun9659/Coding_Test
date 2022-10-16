package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이친수
// DP
// 다시 복기하기
public class Quiz_02193 {
	static long[] dp;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new long[n+1];
		
		System.out.println(dp(n));
	}
	
	static long dp(int n) {
		if(n == 1) return 1;
		else if(n == 2) return 1;
		else if(dp[n] != 0) return dp[n];
		else {
			return dp[n] = dp(n - 1) + dp(n - 2);
		}
	}
}