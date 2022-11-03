package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 연결 요소의 개수
// DFS, BFS
public class Quiz_11724 {
	
	public static int n, m;
	public static int cnt = 0;
	
	public static int[][] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 정점의 개수
		m = Integer.parseInt(st.nextToken()); // 간선의 개수
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			arr[u][v]++;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) { 
				// dfs1(i);
				dfs2(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	// 재귀 방식(DFS)
	public static void dfs1(int v) {
		visited[v] = true;
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i] && (arr[v][i] == 1 || arr[i][v] == 1)) {
				dfs1(i);
			}
		}
	}
	
	// 스택 방식(DFS)
	public static void dfs2(int v) {
		visited[v] = true;
		
		Stack<Integer> stack = new Stack<>();
		stack.push(v);
		
		while(!stack.isEmpty()) {
			boolean hasNearNode = false;
			int value = stack.peek();
			
			for(int i = 1; i <= n; i++) {
				if(!visited[i] && (arr[value][i] == 1 || arr[i][value] == 1)) {
					hasNearNode = true;
					visited[i] = true;
					stack.push(i);
					break;
				}
			}
			if(!hasNearNode) stack.pop();
		}
	}
}