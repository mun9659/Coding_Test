package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스티커
// 답을 봤지만 이해는 됐다. 다시 풀어보기
public class Quiz_09465 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][n + 1];
			int[][] dp = new int[2][n + 1];
			for(int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j < n + 1; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int i = 2; i < n + 1; i++) {
				dp[0][i] = Math.max(dp[1][i - 2], dp[1][i - 1]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i - 2], dp[0][i - 1]) + arr[1][i];
			}
			
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
	}
}