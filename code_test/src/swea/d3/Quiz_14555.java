package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공과 잡초
public class Quiz_14555 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			String str = br.readLine();
			
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				// 완전한 공
				if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
					cnt++;
					i++;
					continue;
				}
				
				// 완전하지 않은 공
				if(str.charAt(i) == '(') {
					cnt++;
				} else if(str.charAt(i) == ')') {
					cnt++;
				}
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
