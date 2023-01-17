package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 7
public class Quiz_15624 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] dp = new long[1000001];
		
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
		}
		System.out.println(dp[n]);
	}
}