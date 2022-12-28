package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한윤정이 이탈리아에 가서 아이스크림을 사먹는데
// 답을 봤고 좀만 더 수정하면 됐으니 무조건 풀어보자
public class Quiz_02422 {
	
	public static int n, m, result = 0;
	public static int[] data = new int[3];
	public static int[][] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 아이스크림 종류의 수
		m = Integer.parseInt(st.nextToken()); // 섞어먹으면 안 되는 조합의 개수
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x] = 1;
		}
		
		dfs(1, 0);
		System.out.println(result);
	}
	
	public static void dfs(int val, int count) {
		if(count == 3) {
			if(check()) {
				result++;
			}
			return;
		}
		
		for(int i = val; i < n + 1; i++) {
			if(!visited[i]) {
				visited[val] = true;
				data[count] = i;
				dfs(i + 1, count+1);
				visited[val] = false;
			}
		}
	}
	
	public static boolean check() {
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 3; j++) {
				if(arr[data[i]][data[j]] == 1) {
					return false;
				}
			}
		}
		return true;
	}
}