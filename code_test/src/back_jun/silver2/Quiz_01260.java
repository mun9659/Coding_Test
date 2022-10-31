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
	
	public static StringBuilder sb = new StringBuilder();
	public static Stack<Integer> stack = new Stack<>();
	public static Queue<Integer> que = new LinkedList<>();
	
	public static int n, m, v;
	public static int[][] nodes;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		nodes = new int[n + 1][n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			nodes[n1][n2]++;
		}
		
		//dfs1(v);
		dfs2(v);
		sb.append("\n");
		
		visited = new boolean[n + 1];
		bfs(v);
		
		System.out.println(sb);
	}
	
	// 재귀방식 DFS
	public static void dfs1(int v) {
		visited[v] = true;
		sb.append(v).append(" ");
		
		for(int i = 1; i < nodes.length; i++) {
			if(!visited[i] && (nodes[v][i] == 1 || nodes[i][v] == 1)) {
				dfs1(i);
			}
		}
	}
	
	// 스택방식 DFS
	public static void dfs2(int v) {
		visited[v] = true;
		
		stack.push(v);
		sb.append(v).append(" ");
		while(!stack.isEmpty()) {
			int start = stack.peek();
			
			boolean hasNearNode = false;
			for(int i = 1; i < nodes.length; i++) {
				if(!visited[i] && (nodes[start][i] == 1 || nodes[i][start] == 1)) {
					visited[i] = true;
					hasNearNode = true;
					stack.push(i);
					sb.append(i).append(" ");
					break;
				}
			}
			if(!hasNearNode) stack.pop();
		}
	}
	
	// BFS
	public static void bfs(int v) {
		visited[v] = true;
		
		que.offer(v);
		sb.append(v).append(" ");
		while(!que.isEmpty()) {
			int start = que.poll();
			
			for(int i = 1; i < nodes.length; i++) {
				if(!visited[i] && (nodes[start][i] == 1 || nodes[i][start] == 1)) {
					visited[i] = true;
					que.offer(i);
					sb.append(i).append(" ");
				}
			}
		}
	}
}