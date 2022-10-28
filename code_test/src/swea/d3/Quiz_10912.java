package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 외로운 문자
// 전에 맞쳐놓고 지금 좀 헤맴, 다시 풀어보기
public class Quiz_10912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int[] alpha = new int[26];
			char[] str_arr = br.readLine().toCharArray();
			
			for(int i = 0; i < str_arr.length; i++) {
				alpha[str_arr[i] - 'a']++;
			}
			
			int cnt = 0;
			String result = "";
			for(int i = 0; i < 26; i++) {
				if(alpha[i] % 2 != 0) {
					cnt++;
					result += (char)(i + 'a');
				}
			}
			if(cnt == 0) result = "Good";
			
			System.out.printf("#%d %s\n", tc, result);
		}
	}
}
