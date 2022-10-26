package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 교환학생
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
			
			int cnt = 0, i = 0, day = 0;
			boolean chk = false;
			while(cnt != n) {
				if(week[i % 7] == 1) {
					cnt++;
					chk = true;
				}
				if(chk) day++;
				i++;
			}
			System.out.printf("#%d %d\n", tc, day);
		}
	}
}
