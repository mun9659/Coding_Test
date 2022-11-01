package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2*n 타일링 2
// 다시 해보기
public class Quiz_11727 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
		}
		System.out.println(dp[n]% 10007);
	}
}