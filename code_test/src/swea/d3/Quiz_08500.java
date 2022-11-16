package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 극장 좌석
// 계산식인데 구현하지는 못했다, 다시 풀어보자
public class Quiz_08500 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			int max = 0, sum = 0;
			for(int i = 0; i < n; i++) {
				int num =  Integer.parseInt(st.nextToken());
				max = Math.max(max, num);
				sum += num;
			}
			System.out.printf("#%d %d\n", tc, sum + n + max);
		}
	}
}