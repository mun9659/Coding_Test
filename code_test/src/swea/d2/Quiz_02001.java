package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파리 퇴치
public class Quiz_02001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][n];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			for(int i = 0; i <= n - m; i++) {
				for(int j = 0; j <= n - m; j++) {
					int sum = 0;
					for(int k = i; k < i + m; k++) {
						for(int s = j; s < j + m; s++) {
							sum += arr[k][s];
						}
					}
					
					max = Math.max(max, sum);
				}
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}
