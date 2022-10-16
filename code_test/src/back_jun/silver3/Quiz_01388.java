package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바닥 장식
// DFS, BFS
public class Quiz_01388 {
	static int n, m;
	static String[][] land;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		land = new String[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			land[i] = br.readLine().split("");
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(land[i][j].equals("-") && !visited[i][j]) {
					cnt++;
					row(i, j);
				}
				
				if(land[i][j].equals("|") && !visited[i][j]) {
					cnt++;
					col(i, j);
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	static void row(int y, int x) {
		visited[y][x] = true;
		// System.out.println("접근 노드1 : " + y + " | " + x);
		
		if(x+1 == m) return;
		if(!visited[y][x+1] && land[y][x+1].equals("-")) row(y, x+1);
	}
	
	static void col(int y, int x) {
		visited[y][x] = true;
		// System.out.println("접근 노드2 : " + y + " | " + x);
		
		if(y+1 == n) return;
		if(!visited[y+1][x] && land[y+1][x].equals("|")) col(y+1, x);
	}
}