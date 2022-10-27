package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반반
public class Quiz_11856 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			int[] alpha = new int[26];
			char[] str_arr = br.readLine().toCharArray();
			
			for(int i = 0; i < str_arr.length; i++) {
				alpha[str_arr[i] - 'A']++;
			}
			
			int cnt = 0;
			for(int i = 0; i < alpha.length; i++) {
				if(alpha[i] == 2) cnt++;
			}
			
			if(cnt == 2) System.out.printf("#%d %s\n", tc, "Yes");
			else System.out.printf("#%d %s\n", tc, "No");
		}
	}
}
