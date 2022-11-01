package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1, 2, 3 더하기
// 너무 단순한 문제, 이해를 하려 하자
public class Quiz_09095 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 1; i <= T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int j = 4; j <= n; j++) {
				dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
			}
			System.out.println(dp[n]);
		}
	}
}