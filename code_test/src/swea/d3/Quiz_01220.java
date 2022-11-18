package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 5일차- Magnetic
public class Quiz_01220 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for(int i = 0; i < n; i++) {
				sb.setLength(0);
				for(int j = 0; j < n; j++) {
					if(arr[j][i] != 0) {
						sb.append(arr[j][i]);
					}
				}
				
				for(int j = 0; j < sb.length() - 1; j++) {
					if(sb.substring(j, j+2).equals("12")) {
						count++;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, count);
		}
	}
}