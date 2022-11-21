package back_jun.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 테트로미노
// 거의 다 풀긴 했지만 역시 가지뻗기는 조금 어렵다. 다시 풀자!
// 왜 다시 푸니까 현저히 느리고 현저히 안 좋아졌는가? 다시 풀자.
public class Quiz_14500 {
	
	public static int n, m;
	public static int max = 0;
	public static int[][] arr;
	public static boolean[][] visited;
	
	public static int[] dirX = {0, 0, -1, 1};
	public static int[] dirY = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 테트로미노 체크 시작
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dfs(i, j, 1, arr[i][j]);
				visited[i][j] = false;
			}
		}
		
		System.out.println(max);
	}
	
	public static void dfs(int y, int x, int count, int sum) {
		if(count == 4) {
			max = Math.max(max, sum);
			return;
		}
		visited[y][x] = true;
		
		//상하좌우 체크
		for(int i = 0; i < 4; i++) {
			int dy = y + dirY[i];
			int dx = x + dirX[i];
			
			if(rangeCheck(dy, dx) && !visited[dy][dx] && count < 4) {
				
				if(count == 2) {
					visited[dy][dx] = true;
					dfs(y, x, count + 1, sum + arr[dy][dx]);
					visited[dy][dx] = false;
				}
				
				visited[dy][dx] = true;
				dfs(dy, dx, count + 1, sum + arr[dy][dx]);
				visited[dy][dx] = false;
			}
		}
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < m;
	}
}
