package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 점프
// 시간 초과
// DFS로는 바로 풀었지만 DP가 포함되어 있어서 이거에 대해 이해를 좀 해야한다.(Top-Down방식)
// 56퍼에서 틀림(오른쪽 아래 끝이 무조건 0이지만 다른 부분이 0일 수도 있다!)
public class Quiz_01890 {
	
	public static int n;
	public static int[][] game;
	public static long[][] dp;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		game = new int[n][n];
		dp = new long[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				game[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		System.out.println(dfs(0, 0));
	}
	
	public static long dfs(int y, int x) {
		if(y == n -1 && x == n - 1) {
			return 1;
		}
		
		if(dp[y][x] == -1) {
			dp[y][x] = 0;
			
			int dy = y + game[y][x];
			int dx = x + game[y][x];
			
			if(rangeCheck(dy)) dp[y][x] += dfs(dy, x);
			if(rangeCheck(dx)) dp[y][x] += dfs(y, dx);
		}
		
		return dp[y][x];
	}
	
	public static boolean rangeCheck(int val) {
		return val >= 0 && val < n;
	}
}