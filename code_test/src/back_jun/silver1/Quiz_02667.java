package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

// 단지 번호 붙이기
// DFS, BFS
public class Quiz_02667 {
	
	public static int n;
	public static int[] dirX = {0, 0, -1, 1};
	public static int[] dirY = {-1, 1, 0, 0};
	
	public static int[][] arr;
	public static boolean[][] visited;
	
	public static ArrayList<Integer> cnt_arr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			String[] str_arr = br.readLine().split("");
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str_arr[j]);
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					dfs(i, j);
					cnt++;
				}
			}
		}
		sb.append(cnt + "\n");
		cnt_arr.sort(null);
		for(int i = 0; i < cnt_arr.size(); i++) {
			sb.append(cnt_arr.get(i) + "\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int y, int x) {
		visited[y][x] = true;
		int[] start = {y, x};
		
		Stack<int[]> stack = new Stack<>();
		stack.push(start);
		
		int count = 0;
		while(!stack.isEmpty()) {
			int[] val = stack.peek();
			
			boolean hasNearNode = false;
			for(int i = 0; i < 4; i++) {
				int dy = val[0] + dirY[i];
				int dx = val[1] + dirX[i];
				
				if(rangeCheck(dy, dx) && !visited[dy][dx] && arr[dy][dx] == 1) {
					int[] check = {dy, dx};
					stack.push(check);
					visited[dy][dx] = true;
					hasNearNode = true;
				}
			}
			if(!hasNearNode) {
				count++;
				stack.pop();
			}
		}
		cnt_arr.add(count);
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < n;
	}
}