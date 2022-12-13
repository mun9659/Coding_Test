package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연속합
// 다시 한번 더 고찰
public class Quiz_01912 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		dp[0] = arr[0];
		max = dp[0];
		
		// Bottom-Up 방식
		for(int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
		}

		for(int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}