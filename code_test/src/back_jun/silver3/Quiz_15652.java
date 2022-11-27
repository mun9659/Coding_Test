package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (4)
// 백트래킹
public class Quiz_15652 {
	
	public static int n, m;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int index) {
		if(index == m) {
			for(int i = 0; i < m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(index > 0) {
				if(i >= arr[index - 1] - 1) {
					arr[index] = i + 1;
					dfs(index + 1);
				}
			} else {
				arr[index] = i + 1;
				dfs(index + 1);
			}
		}
	}
}