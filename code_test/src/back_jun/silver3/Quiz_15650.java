package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (2)
// 백트래킹
public class Quiz_15650 {
	
	public static int n, m;
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		dfs(0, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int index, int num) {
		if(index == m) {
			for(int i = 0; i < m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i] && i >= num) { // 앞 인덱스 값보다 더 높아야 하기 때문에
				arr[index] = i + 1;
				visited[i] = true;
				dfs(index + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}