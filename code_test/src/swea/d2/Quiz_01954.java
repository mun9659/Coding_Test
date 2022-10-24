package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달팽이 숫자
// 다시 풀어보자, 항상 복기
public class Quiz_01954 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			int x = 0, y = 0;
			int num = 1; // 시작 숫자
			int curved = 0; // 꺾어야하는 인덱스값
			arr[y][x] = num++;
			// 결국 끝에 도달하여 넘어가려고 할 때 루트를 바꿔야한다.
			int[] x_arr = {1, 0, -1, 0};
			int[] y_arr = {0, 1, 0, -1};
			while(num <= n * n) {
				int dy = y + y_arr[curved % 4]; // y_index 위치 
				int dx = x + x_arr[curved % 4]; // x_index 위치
				if(dy < 0 || dy >= n || dx < 0 || dx >= n || arr[dy][dx] != 0) {
					curved++;
					continue;
				}
				arr[dy][dx] = num++;
				y = dy;
				x = dx;
			}
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
