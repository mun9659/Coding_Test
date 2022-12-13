package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 징검다리 건너기
// DP 보다는 DFS가 더 강해서 조금 헷갈렸음, 다시 풀어보기
public class Quiz_21317 {
	
	public static int[][] jumps;
	public static int n, k, result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		jumps = new int[n - 1][2];
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			jumps[i][0] = Integer.parseInt(st.nextToken());
			jumps[i][1] = Integer.parseInt(st.nextToken());
		}
		k = Integer.parseInt(br.readLine());
		
		dfs(0, 0, false);
		
		System.out.println(result);
	}
	
	public static void dfs(int stoneidx, int energy, boolean bigJump) {
		if(stoneidx == n - 1) {
			result = Math.min(result, energy);
			return;
		}
		if(stoneidx > n - 1) return;
		
		// 1. 작은 점프
		dfs(stoneidx + 1, energy + jumps[stoneidx][0], bigJump);
		// 2. 큰 점프
		dfs(stoneidx + 2, energy + jumps[stoneidx][1], bigJump);
		// 3. 매우 큰 점프
		if(!bigJump) dfs(stoneidx + 3, energy + k, true);
	}
}