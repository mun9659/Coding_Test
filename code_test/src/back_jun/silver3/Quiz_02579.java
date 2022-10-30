package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
// DP
// 답을 또 봄, 복기하기
public class Quiz_02579 {
	
	public static int[] arr;
	public static Integer[] dp;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		dp = new Integer[n + 1]; // 계단 오르기의 최대값 저장 배열
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = arr[0];
		dp[1] = arr[1];
		
		if(n > 1) dp[2] = arr[1] + arr[2];
		
		dp(n);
		
		System.out.println(dp[n]);
	}
	
	public static int dp(int n) {
		if(dp[n] != null) return dp[n];
		else {
			dp[n] = Math.max(dp(n - 3) + arr[n - 1], dp(n - 2)) + arr[n];
		}
		return dp[n];
	}
}