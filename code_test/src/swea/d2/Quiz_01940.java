package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가랏! RC카!
public class Quiz_01940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int speed = 0, sum = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int c1 = Integer.parseInt(st.nextToken()); // 0 : 유지, 1 : 가속, 2 : 감속
				int c2 = 0;
				if(c1 != 0) {
					c2 = Integer.parseInt(st.nextToken()); // 속도
				}
				
				if(c1 == 1) {
					speed += c2;
				} else if(c1 == 2) {
					speed -= c2;
				}
				
				if(speed < 0) speed = 0;
				
				sum += speed;
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
