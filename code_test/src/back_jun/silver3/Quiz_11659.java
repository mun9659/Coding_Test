package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 4
// 시간 초과
// 누적 합(다이나믹 프로그래밍과 비슷), 다시 한번 더 풀어보기
public class Quiz_11659 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] n_arr = new int[n+1];
		long[] sum_arr = new long[n+1];
		
		st = new StringTokenizer(br.readLine());
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			n_arr[i] = num;
			sum_arr[i] = sum;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			sb.append((sum_arr[y] - sum_arr[x - 1]) + "\n");
		}
		
		System.out.println(sb);
	}
}