package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 공부
public class Quiz_15230 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			char[] str = br.readLine().toCharArray();
			
			char start = 'a';
			int cnt = 0;
			for(int i = 0; i < str.length; i++) {
				if(str[i] == start) {
					start++;
					cnt++;
				}
				else break;
			}
			
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
