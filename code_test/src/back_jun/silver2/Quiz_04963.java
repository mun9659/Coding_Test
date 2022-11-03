package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 섬의 개수
// DFS
// 너무나도 단순했다. 세어지는 값을 dfs 함수 안이 아니라 결과로 나타내고 나서 하면 되었던것...!
public class Quiz_04963 {
	
	public static int w, h;
	public static int[] dirX = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int[] dirY = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	public static int[][] land;
	public static boolean[][] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) break;
			
			land = new int[h][w];
			visited = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					land[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(!visited[i][j] && land[i][j] == 1) {
						//dfs1(i, j);
						dfs2(i, j);
						cnt++;
					}
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
	
	// 재귀 방식(DFS)
	public static void dfs1(int y, int x) {
		visited[y][x] = true;
		
		for(int i = 0; i < 8; i++) {
			int dy = y + dirY[i];
			int dx = x + dirX[i];
			
			if(rangeChk(dx, dy) && !visited[dy][dx] && land[dy][dx] == 1) {
				dfs1(dy, dx);
			}
		}
	}
	
	// 스택 방식(DFS)
	public static void dfs2(int y, int x) {
		visited[y][x] = true;
		
		int[] arr = {y, x};
		
		Stack<int[]> stack = new Stack<>();
		stack.push(arr);
		
		while(!stack.isEmpty()) {
			boolean hasNearNode = false;
			
			int[] peek_arr = stack.peek();
			
			for(int i = 0; i < 8; i++) {
				int dy = peek_arr[0] + dirY[i];
				int dx = peek_arr[1] + dirX[i];
				
				if(rangeChk(dx, dy) && !visited[dy][dx] && land[dy][dx] == 1) {
					int[] push_arr = {dy, dx};
					hasNearNode = true;
					visited[dy][dx] = true;
					stack.push(push_arr);
				}
			}
			if(!hasNearNode) stack.pop();
		}
	}
	
	// x, y좌표 체크
	public static boolean rangeChk(int dx, int dy) {
		return (dx >= 0 && dx < w) && (dy >= 0 && dy < h);
	}
}

	
