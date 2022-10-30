package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
// 다이나믹 프로그래밍
public class Quiz_01003 {
	public static Integer[][] dp = new Integer[41][2];
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 0 / 1 의 개수 초기값
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			Integer[] chk = fib(n);
			System.out.println(chk[0] + " " + chk[1]);
		}
	}
	
	public static Integer[] fib(int n) {
		if(dp[n][0] == null && dp[n][1] == null) {
			dp[n][0] = fib(n - 1)[0] + fib(n - 2)[0];
			dp[n][1] = fib(n - 1)[1] + fib(n - 2)[1];
		}
		return dp[n];
	}
}