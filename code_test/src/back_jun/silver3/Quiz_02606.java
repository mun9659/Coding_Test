package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 바이러스
// BFS, DFS
// 다시 풀어보자
public class Quiz_02606 {
	public static int cnt = 0;
	public static int[][] arr;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int twin = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < twin; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			arr[n1][n2]++;
		}
		
		// dfs1(1);
		dfs2(1);
		
		System.out.println(cnt);
	}
	
	// 재귀 방식
	public static void dfs1(int start) {
		visited[start] = true;
		
		for(int i = 1; i < arr.length; i++) {
			if(!visited[i] && (arr[start][i] == 1 || arr[i][start] == 1)) {
				cnt++;
				dfs1(i);
			}
		}
	}
	
	// 스택 방식
	public static void dfs2(int start) {
		visited[start] = true;
		
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		while(!stack.isEmpty()) {
			int value = stack.peek();
			boolean hasNearNode = false; // 근접 노드 확인용
			for(int i = 1; i < arr.length; i++) {
				if(!visited[i] && (arr[value][i] == 1 || arr[i][value] == 1)) {
					System.out.println("i : " + i);
					hasNearNode = true;
					stack.push(i);
					cnt++;
					dfs2(i);
					break;
				}
			}
			if(!hasNearNode) stack.pop();
		}
	}
}