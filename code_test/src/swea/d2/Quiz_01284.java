package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수도 요금 경쟁
public class Quiz_01284 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken()); // A사의 리터당 요금
			int q = Integer.parseInt(st.nextToken()); // B사의 기본 요금
			int r = Integer.parseInt(st.nextToken()); // B사의 월간 사용량 이하 기준
			int s = Integer.parseInt(st.nextToken()); // B사의 초과 요금
			int w = Integer.parseInt(st.nextToken()); // 한 달간 사용한 수도의 양
			
			int a = p * w;
			int b = (w > r ? (q + (w - r) * s) : q);
			
			System.out.printf("#%d %d\n", tc, Math.min(a, b));
		}
	}
}
