package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 포도주 시식
// 전에 하던 계단 오르기랑 다르다!
public class Quiz_02156 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		if(n > 1) {
			dp[2] = dp[1] + arr[2];
		}
		
		for(int i = 3; i < n + 1; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i]);
		}
		
		System.out.println(dp[n]);
	}
}