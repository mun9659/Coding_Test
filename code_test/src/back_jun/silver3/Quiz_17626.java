package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Four Squares
// 점화식을 도출해야한다. 점화식이 쉽게 생각나지 않는다
// 다시 풀어보자
public class Quiz_17626 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			dp[i] = n + 1;
		}
		
		for(int i = 2; i < n + 1; i++) {
			for(int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		System.out.println(dp[n]);
	}
}