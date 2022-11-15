package back_jun.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 적록색약
public class Quiz_10026 {
	
	public static int n;
	public static int nor = 0, unor = 0;
	public static char[][] arr1, arr2;
	public static boolean[][] visited1, visited2;
	
	public static int[] dirX = {0, 0, -1, 1};
	public static int[] dirY = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		arr1 = new char[n][n];
		arr2 = new char[n][n];
		visited1 = new boolean[n][n];
		visited2 = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr1[i][j] == 'G') arr2[i][j] = 'R';
				else arr2[i][j] = arr1[i][j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited1[i][j]) {
					bfs1(i, j, arr1[i][j]);
					nor++;
				}
				if(!visited2[i][j]) {
					bfs2(i, j, arr2[i][j]);
					unor++;
				}
			}
		}
		System.out.println(nor + " " + unor);
	}
	
	public static void bfs1(int y, int x, char color) {
		visited1[y][x] = true;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {y, x});
		while(!que.isEmpty()) {
			int[] val = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int dy = val[0] + dirY[i];
				int dx = val[1] + dirX[i];
				
				if(rangeCheck(dy, dx) && !visited1[dy][dx] && color == arr1[dy][dx]) {
					visited1[dy][dx] = true;
					que.add(new int[] {dy, dx});
				}
			}
		}
	}
	
	public static void bfs2(int y, int x, char color) {
		visited2[y][x] = true;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {y, x});
		while(!que.isEmpty()) {
			int[] val = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int dy = val[0] + dirY[i];
				int dx = val[1] + dirX[i];
				
				if(rangeCheck(dy, dx) && !visited2[dy][dx] && color == arr2[dy][dx]) {
					visited2[dy][dx] = true;
					que.add(new int[] {dy, dx});
				}
			}
		}
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < n;
	}
}