package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 몬스터 사냥
public class Quiz_11387 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int D = Integer.parseInt(st.nextToken()); // 기본 데미지
			double L = Integer.parseInt(st.nextToken()); // 레벨에 따른 추가 데미지
			int N = Integer.parseInt(st.nextToken()); // 때린 횟수
			
			int sum = 0;
			for(int i = 0; i < N; i++) {
				sum += (int)(D * ((1 + i * L / 100))); 
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
