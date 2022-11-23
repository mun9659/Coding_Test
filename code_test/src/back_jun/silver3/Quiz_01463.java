package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
// 답을 봄. 다시 복기하기
// "무조건 큰 수로 나눈다고 해결되진 않는다."
// DP로는 해결, 계산식으로 할 수 있다지만 조금 덜 이해되서 나중에 다시 풀기
public class Quiz_01463 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		
		dp[0] = dp[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			// 1. 1을 뺀다.
			dp[i] = dp[i - 1] + 1;
			// 2. X가 2로 나누어 떨어지면, 2로 나눈다.
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			// 3. X가 3으로 나누어 떨어지면, 3으로 나눈다.
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		}
		System.out.println(dp[n]);
	}
}