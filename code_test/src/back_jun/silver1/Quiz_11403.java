package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 경로 찾기
// 플로이드 워셜(알고리즘)이라는데 일단 모르는 상태로 품
public class Quiz_11403 {
	
	public static int n;
	public static int[][] graph;
	public static int[][] result;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		graph = new int[n][n];
		result = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			floyd(i);
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void floyd(int v) {
		visited = new boolean[n];
		Queue<Integer> que = new LinkedList<>();
		que.offer(v);
		
		while(!que.isEmpty()) {
			int val = que.poll();
			
			for(int i = 0; i < n; i++) {
				if(!visited[i] && graph[val][i] == 1) {
					que.offer(i);
					visited[i] = true;
					result[v][i] = 1;
				}
			}
		}
	}
}