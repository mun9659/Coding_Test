package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 치킨치킨치킨
// 진짜 쉬운 문제인데 답을 봐버렸다... 제대로 풀어보자.
public class Quiz_16439 {
	
	public static int n, m, result = 0;
	public static int[][] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 고리 회원의 수
		m = Integer.parseInt(st.nextToken()); // 치킨 종류의 수
		
		arr = new int[n][m]; // 각 치킨에 대한 회원의 만족도
		visited = new boolean[m];
		
		// 중요점 : 최대 3가지의 종류의 치킨만 시켜먹어 최대의 만족도를 구하라
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		
		System.out.println(result);
	}
	
	// 1. 3개의 index를 구하고
	// 2. 3개의 index에서 최대 만족도 값을 구하라.
	public static void dfs(int index, int depth) {
		if(depth == 3) {
			System.out.println(index);
			int sum = 0;
			for(int i = 0; i < n; i++) {
				int num = Integer.MIN_VALUE;
				for(int j = 0; j < m; j++) {
					if(visited[j]) {
						num = Math.max(num, arr[i][j]);
					}
				}
				sum += num;
			}
			result = Math.max(result, sum);
			return;
		}
		
		for(int i = index; i < m; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			dfs(i, depth + 1);
			visited[i] = false;
		}
	}
}
