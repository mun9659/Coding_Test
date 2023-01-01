package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 쉬운 최단거리
public class Quiz_14940 {
	
	public static int result_x, result_y;
	public static int n, m;
	public static int[][] land;
	public static int[][] result;
	
	public static int[] dirY = {-1, 1, 0, 0};
	public static int[] dirX = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		land = new int[n][m];
		result = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
				if(land[i][j] == 2) {
					result_y = i;
					result_x = j;
				}
				else if(land[i][j] == 0) result[i][j] = 0;
				else result[i][j] = -1;
				
			}
		}
		bfs();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void bfs() {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {result_y, result_x, 0});
		
		while(!que.isEmpty()) {
			int[] value = que.poll();
			int y = value[0], x = value[1], count = value[2];
			
			for(int i = 0; i < 4; i++) {
				int dy = y + dirY[i];
				int dx = x + dirX[i];
				
				if(rangeCheck(dy,dx) && land[dy][dx] == 1 && result[dy][dx] == -1) {
					que.add(new int[] {dy, dx, count + 1});
					result[dy][dx] = count + 1;
				}
			}
		}
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < m;
	}
}