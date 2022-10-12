package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 바이러스
// 연습 많이 하자
public class Quiz_02606 {
	static int cnt = 0;
	// static int[][] com; // 재귀함수 전용
	// static boolean[] visited; // 재귀함수 전용
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int twin = Integer.parseInt(br.readLine());
		int[][] com = new int[n+1][n+1];
		boolean[] visited = new boolean[n+1];
		
		StringTokenizer st;
		for(int i = 0; i < twin; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			
			com[t1][t2]++;
		}
		
		// dfs(1);
		dfs2(com, 1, visited);
		
		System.out.println(cnt);
	}
	
	// 재귀함수 표현
	/*
	static void dfs(int n) {
		// 현재 노드 방문 처리
		visited[n] = true;
		cnt++;
		// 접속한 노드
		// System.out.println(n);
		
		for(int i = 0; i < com[n].length; i++) {
			if(visited[i]==false && (com[n][i] == 1 || com[i][n] == 1)) {
				dfs(i);
			}
		}
	}
	*/
	// 스택 표현
	static void dfs2(int[][] com, int start, boolean[] visited) {
		visited[start] = true;
		System.out.println(start);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			int now = stack.peek();
			
			boolean hasNearNode = false; // 방문하지 않은 인접 노드가 있는지 확인
			for(int i = 0; i < com[now].length; i++) {
				if(!visited[i] && (com[now][i] == 1 || com[i][now] == 1)) {
					hasNearNode = true;
					stack.push(i);
					visited[i] = true;
					System.out.println(i);
					cnt++;
					break;
				}
			}
			if(hasNearNode == false) stack.pop();
		}
	}
}