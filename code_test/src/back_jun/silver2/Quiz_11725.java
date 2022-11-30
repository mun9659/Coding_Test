package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 트리의 부모 찾기
// 잘 모르겠다. 좀 더 익숙해져야겠다.
public class Quiz_11725 {
	
	public static int n;
	public static ArrayList<Integer>[] list;
	public static int[] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine()); // 노드의 개수
		list = new ArrayList[n+1];
		arr = new int[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			list[y].add(x);
		}
		
		// for(int i = 1; i <= n; i++) {
		//	System.out.println(list[i]);
		// }
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		for(int i = 2; i <= n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		for(int i : list[v]) {
			if(!visited[i]) {
				arr[i] = v;
				dfs(i);
			}
		}
	}
}