package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 - 2
// 시간 초과 생각
public class Quiz_02748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] dp = new long[91];
		int n = Integer.parseInt(br.readLine());
		
		int i = 0;
		// 다이나믹 프로그래밍
		while(i < n+1) {
			if(i < 2) {
				dp[i] = i;
			} else {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			i++;
		}
		System.out.println(dp[n]);
	}
}
