package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시각 덧셈
public class Quiz_01976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int h_sum = h1 + h2;
			int m_sum = m1 + m2;
			
			if(m_sum >= 60) {
				h_sum += 1;
				m_sum -= 60;
			}
			if(h_sum > 12) {
				h_sum -= 12;
			}
			
			System.out.printf("#%d %d %d\n", tc, h_sum, m_sum);
		}
	}
}
