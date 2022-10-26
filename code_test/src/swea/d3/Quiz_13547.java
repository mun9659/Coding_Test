package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팔씨름
public class Quiz_13547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int cnt = 0, full = 15;
			char[] arr = br.readLine().toCharArray();
			
			full -= arr.length;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 'o') cnt++;
			}
			
			if(cnt + full >= 8) System.out.printf("#%d %s\n", tc, "YES");
			else System.out.printf("#%d %s\n", tc, "NO");
		}
	}
}
