package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수의 새로운 연산
public class Quiz_01491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			int[] cur1_p = cur1(p);
			int[] cur1_q = cur1(q);
			
			sb.append("#"+tc+" "+cur2(cur1_p[0] + cur1_q[0], cur1_p[1] + cur1_q[1])+"\n");
			
		}
		System.out.println(sb);
	}
	
	public static int[] cur1(int n) {
		int[] result = {1, 1};
		int count = 1;
		while(count < n) {
			if(result[1] - 1 == 0) {
				result[1] = result[0] + 1;
				result[0] = 1;
			} else {
				result[1] -= 1;
				result[0] += 1;
			}
			count++;
		}
		
		return result;
	}
	
	public static int cur2(int x, int y) {
		int result = 1;
		while(x != 1 || y != 1) {
			if(x - 1 == 0) {
				x = y - 1;
				y = 1;
			} else {
				x--;
				y++;
			}
			result++;
		}
		return result;
	}
}