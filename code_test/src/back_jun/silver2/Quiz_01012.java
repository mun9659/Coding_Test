package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유기농 배추
// 그래프 탐색, 그래프 검색, BFS, DFS
public class Quiz_01012 {
	
	public static int m, n, k;
	public static int result;
	
	public static int[][] land;
	public static boolean[][] visited;
	public static int[] dirX = {-1, 1, 0, 0};
	public static int[] dirY = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			land = new int[n][m];
			visited = new boolean[n][m];
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				land[y][x]++;
			}
			
			result = 0;
			for(int j = 0; j < n; j++) {
				for(int s = 0; s < m; s++) {
					if(!visited[j][s] && land[j][s] == 1) {
						dfs(j, s);
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}
	
	public static void dfs(int y, int x) {
		visited[y][x] = true;
		
		for(int i = 0; i < 4; i++) {
			int dx = x + dirX[i];
			int dy = y + dirY[i];
			
			if(range_chk(dy, dx) && !visited[dy][dx] && land[dy][dx] == 1) {
				dfs(dy, dx);
			}
		}
	}
	
	public static boolean range_chk(int y, int x) {
		return (y >= 0 && y < n && x >= 0 && x < m);
	}
}