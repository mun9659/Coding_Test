package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
public class Quiz_02579 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		if(n > 1) {
			dp[2] = dp[1] + arr[2];
		}
		
		// index 3 이상 부터 체크 하는거 2개
		// 1. 두칸 전 dp + 한칸 띄우고 +현재 칸 비교
		// 2. 세칸 전 dp + 한칸 전 arr + 현재 칸 비교
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
		}
		
		System.out.println(dp[n]);
	}
}