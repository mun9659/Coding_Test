package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 초보자의  회문 검사
public class Quiz_01989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			char[] str_arr = br.readLine().toCharArray();
			int result = 1;
			for(int i = 0; i < str_arr.length / 2; i++) {
				if(str_arr[i] != str_arr[str_arr.length - 1 - i]) {
					result = 0;
					break;
				}
			}
			System.out.printf("#%d %d", tc, result);
		}
	}
}
