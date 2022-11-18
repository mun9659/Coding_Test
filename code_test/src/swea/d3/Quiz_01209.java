package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 2일차 - Sum
public class Quiz_01209 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[100][100];
			for(int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			
			// 1. 가로, 세로
			for(int i = 0; i < 100; i++) {
				int sum1 = 0, sum2 = 0;
				for(int j = 0; j < 100; j++) {
					sum1 += arr[i][j];
					sum2 += arr[j][i];
				}
				max = Math.max(max, Math.max(sum1, sum2));
			}
			
			// 2. 대각선
			int sum1 = 0, sum2 =0;
			for(int i = 0; i < 100; i++) {
				sum1 += arr[i][i];
				sum2 += arr[i][100 - 1 - i];
			}
			max = Math.max(max, Math.max(sum1, sum2));
			
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}