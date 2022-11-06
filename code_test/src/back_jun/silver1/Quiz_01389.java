package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 케빈 베이컨의 6단계 법칙
public class Quiz_01389 {
	
	public static int n, m;
	public static int cnt = Integer.MAX_VALUE;
	public static int index = 0;
	public static int[][] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 유저의 수
		m = Integer.parseInt(st.nextToken()); // 친구 관계의 수(노드)
		
		arr = new int[n + 1][n + 1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b]++;
		}
		
		// 케빈 베이컨 실행
		for(int i = 1; i <= n; i++) {
			visited = new boolean[n + 1];
			bfs(i);
		}
		System.out.println(index);
	}
	
	public static void bfs(int v) {
		visited[v] = true;
		int[] kevin = new int[n + 1];
		
		Queue<Integer> que = new LinkedList<>();
		que.offer(v);
		
		// 최단 거리를 찾아야한다.
		while(!que.isEmpty()) {
			int val = que.poll();
			
			for(int i = 1; i <= n; i++) {
				if(!visited[i] && (arr[i][val] != 0 || arr[val][i] != 0)) {
					visited[i] = true;
					que.offer(i);
					kevin[i] = kevin[val] + 1;
				}
			}
		}
		System.out.println(v + "번째 노드 케빈 배열 : " + Arrays.toString(kevin));
		int count = 0;
		for(int c : kevin) {
			count += c;
		}
		idx_check(v, count);
	}
	
	public static void idx_check(int idx, int count) {
		if(count < cnt) {
			cnt = count;
			index = idx;
		} else if(count == cnt && idx < index) {
			index = idx;
		}
	}
}