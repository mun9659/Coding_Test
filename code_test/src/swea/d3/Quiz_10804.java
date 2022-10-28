package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 거울상
public class Quiz_10804 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			char[] str_arr = br.readLine().toCharArray();
			String result = "";
			for(int i = str_arr.length - 1; i >= 0; i--) {
				if(str_arr[i] == 'b') result += 'd';
				else if(str_arr[i] == 'd') result += 'b';
				else if(str_arr[i] == 'p') result += 'q';
				else result += 'p';
			}
			System.out.printf("#%d %s\n", tc, result);
		}
	}
}
