package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (3)
// 백트래킹
public class Quiz_15651 {
	
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
		
		// 중복된 값도 포함되서 나오기에 boolean 체크가 없다!
		for(int i = 0; i < n; i++) {
			arr[index] = i + 1;
			dfs(index + 1);
		}
	}
}