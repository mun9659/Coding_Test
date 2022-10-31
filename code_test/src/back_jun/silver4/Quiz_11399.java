package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class Quiz_11399 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] t_arr = new int[n + 1]; // 시간 배열
		int[] dp = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			t_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(t_arr);
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			dp[i] = t_arr[i] + dp[i - 1];
			sum += dp[i];
		}
		System.out.println(sum);
	}
}