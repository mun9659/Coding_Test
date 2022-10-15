package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// DFS와 BFS
public class Quiz_01260 {
	static Queue<Integer> que = new LinkedList<>();
	static Stack<Integer> stack = new Stack<>();
	static int n, m, v;
	static int[][] node;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder("");
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		node = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			node[k][s]++;
		}
		
		dfs2(v);
		sb.append("\n");
		
		visited = new boolean[n+1];
		bfs(v);
		
		System.out.println(sb);
		
	}
	
	// 재귀 방식
	static void dfs(int v) {
		visited[v] = true;
		
		sb.append(v).append(" ");
		
		for(int i = 1; i <= n; i++) {
			if((node[v][i] == 1 || node[i][v] == 1) && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	// 스택 방식
	static void dfs2(int v) {
		stack.push(v);
		visited[v] = true;
		
		sb.append(v).append(" ");
		
		while(!stack.isEmpty()) {
			int k = stack.peek();
			
			boolean hasNearNode = false;
			for(int i = 1; i <= n; i++) {
				if((node[k][i] == 1 || node[i][k] == 1) && !visited[i]) {
					hasNearNode = true;
					visited[i] = true;
					stack.push(i);
					sb.append(i).append(" ");
					break;
				}
			}
			if(!hasNearNode) stack.pop();
		}
	}
	
	static void bfs(int v) {
		que.offer(v);
		visited[v] = true;
		
		sb.append(v).append(" ");
		
		while(!que.isEmpty()) {
			int k = que.poll();
			
			for(int i = 1; i <= n; i++) {
				if((node[k][i] == 1 || node[i][k] == 1) && !visited[i]) {
					visited[i] = true;
					sb.append(i).append(" ");
					que.offer(i);
				}
			}
		}
	}
}