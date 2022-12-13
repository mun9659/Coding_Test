package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 큰 증가 부분 수열
public class Quiz_11055 {
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
		for(int i = 1; i < n; i++) {
			dp[i] = arr[i];
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + arr[i]);
				}
			}
		}
		
		for(int val : dp) {
			max = Math.max(val, max);
		}
		System.out.println(max);
	}
}