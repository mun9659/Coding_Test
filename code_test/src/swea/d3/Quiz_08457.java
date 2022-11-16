package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알 단테 스파게티
public class Quiz_08457 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 모래시계 개수
			int b = Integer.parseInt(st.nextToken()); // 면을 삶아야하는 정확한 초
			int e = Integer.parseInt(st.nextToken()); // 모래시계 오차
			
			// 각 모래시계의 xi초 측정 가능
			int[] sandTime = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				sandTime[i] = Integer.parseInt(st.nextToken());
			}
			
			int count = 0;
			for(int i = 0; i < n; i++) {
				int cnt = 1;
				int time = 0;
				boolean check = false;
				while(time <= b + e) {
					time = sandTime[i] * cnt++;
					
					System.out.println(time);
					for(int j = time - e; j <= time + e; j++) {
						if(j == b) {
							count++;
							check = true;
							break;
						}
					}
					if(check) break;
				}
			}
			System.out.printf("#%d %d\n", tc, count);
		}
	}
}