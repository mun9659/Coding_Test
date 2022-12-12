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
		
		dp[0] = arr[0];
		
		// Bottom-Up
		// dp[i] : '부분' 증가 수열에서 'i번째 항'이 '최댓값'인 부분증가수열의 누적합
		for(int i = 0; i < n; i++) {
			dp[i] = arr[i];
			for(int j = 0; j < n; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[j] + arr[i], dp[i]);
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int val : dp) {
			max = Math.max(val, max);
		}
		System.out.println(max);
	}
}