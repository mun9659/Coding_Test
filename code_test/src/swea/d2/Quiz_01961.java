package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자 배열 회전
// 답을 봄, 다시 복기하자, 정답 맞추더라도 계속 복기
public class Quiz_01961 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			int[][] result90 = new int[n][n];
			int[][] result180 = new int[n][n];
			int[][] result270 = new int[n][n];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 90도 시계방향 회전
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					result90[i][j] = arr[n - j - 1][i];
				}
			}
			// 180도 시계방향 회전
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					result180[i][j] = arr[n - i - 1][n - j - 1];
				}
			}
			// 270도 시계방향 회전
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					result270[i][j] = arr[j][n - i - 1];
				}
			}
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					sb.append(result90[i][j]);
				}
				sb.append(' ');
				for(int j = 0; j < n; j++) {
					sb.append(result180[i][j]);
				}
				sb.append(' ');
				for(int j = 0; j < n; j++) {
					sb.append(result270[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
