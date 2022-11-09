package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로 탐색
public class Quiz_02178 {
	
	public static int n, m;
	public static int[][] arr;
	public static int[][] count;
	public static boolean[][] visited;
	public static int[] dirX = {0, 0, -1, 1};
	public static int[] dirY = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][m+1];
		count = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		for(int i = 1; i <= n; i++) {
			String[] str_arr = br.readLine().split("");
			for(int j = 1; j <= m; j++) {
				arr[i][j] = Integer.parseInt(str_arr[j - 1]);
			}
		}
		
		bfs(1, 1);
		
		System.out.println(count[n][m]);
	}
	
	public static void bfs(int y, int x) {
		visited[y][x] = true;
		count[y][x] = 1;
		int[] start = {y, x};
		
		Queue<int[]> que = new LinkedList<>();
		que.add(start);
		
		while(!que.isEmpty()) {
			int[] val = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int dy = val[0] + dirY[i];
				int dx = val[1] + dirX[i];
				
				if(rangeCheck(dy, dx) && !visited[dy][dx] && arr[dy][dx] == 1) {
					// System.out.println(dy + " | " + dx);
					que.offer(new int[] {dy, dx});
					visited[dy][dx] = true;
					count[dy][dx] = count[val[0]][val[1]] + 1;
				}
				
				if(dy == n && dx == m) break;
			}
		}
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y > 0 && y <= n && x > 0 && x <= m;
	}
}