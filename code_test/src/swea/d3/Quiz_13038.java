package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 교환학생
// 다시 풀기
public class Quiz_13038 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int[] week = new int[7];
			for(int i = 0; i < 7; i++) {
				week[i] = Integer.parseInt(st.nextToken());
			}
			
			int start = 0; // 시작 위치
			int min = Integer.MAX_VALUE; // 최소값
			for(int i = 0; i < 7; i++) {
				int count = 0;
				int day = 0;
				if(week[i] == 1) {
					start = i;
				}
				
				while(count != n) {
					if(week[start % 7] == 1) {
						count++;
					}
					start++;
					day++;
				}
				min = Math.min(min, day);
			}
			System.out.printf("#%d %d\n", tc, min);
		}
	}
}
