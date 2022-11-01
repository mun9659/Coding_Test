package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파도반 수열
// 다이나믹 프로그래밍
public class Quiz_09461 {
	public static Long[] dp;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		dp = new Long[101];
		dp[0] = 0L;
		dp[1] = dp[2] = 1L;
		for(int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(P(n));
		}
	}
	
	public static long P(int n) {
		if(dp[n] == null) {
			dp[n] = P(n - 3) + P(n - 2);
		}
		return dp[n];
	}
}