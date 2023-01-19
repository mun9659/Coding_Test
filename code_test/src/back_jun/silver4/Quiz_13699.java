package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 점화식
public class Quiz_13699 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[n + 1];
		
		dp[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i - (j + 1)];
			}
		}
		
		System.out.println(dp[n]);
	}
}