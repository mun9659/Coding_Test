package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 카드놓기
// 이해는 바로 했는데... 알고리즘이 바로 안 떠오른다... 한계인가
public class Quiz_05568 {
	
	public static int n, k;
	public static String[] arr;
	public static boolean[] visited;
	public static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine()); // 카드 수
		k = Integer.parseInt(br.readLine()); // 선택 수
		
		arr = new String[n];
		visited = new boolean[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		dfs(0, "");
		
		System.out.println(set.size());
	}
	
	public static void dfs(int count, String num) {
		if(count == k) {
			set.add(num);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			dfs(count + 1, num + arr[i]);
			visited[i] = false;
		}
	}
}
