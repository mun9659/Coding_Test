package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜 계산기
public class Quiz_01948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int m1 = Integer.parseInt(st.nextToken());
			int d1 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int d2 = Integer.parseInt(st.nextToken());
			
			if(m1 == m2) {
				sb.append("#"+tc).append(' ').append(d2 - d1 + 1);
			} else {
				int sum = 0;
				sum += days[m1] - d1;
				for(int i = m1 + 1; i < m2; i++) {
					sum += days[i];
				}
				sum += d2;
				sb.append("#"+tc).append(' ').append(sum + 1);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
