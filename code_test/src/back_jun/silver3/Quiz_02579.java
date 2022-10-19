package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
// DP
// 답을 또 봄, 복기하기
public class Quiz_02579 {
	static Integer[] dp; // 위치하는 곳의 나타낼 수 있는 최대값의 저장소
	static int[] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n+1];
		arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = arr[0];
		dp[1] = arr[1];
		
		if(n > 1) {
			dp[2] = arr[2] + arr[1];
		}
		System.out.println(cal(n));
	}
	
	// 재귀 방식(Top-Down 방식)
	public static int cal(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(cal(n-3) + arr[n-1], cal(n-2)) + arr[n];
		}
		
		return dp[n];
	}
}