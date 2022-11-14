package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두문자어
public class Quiz_08741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			String[] str_arr = br.readLine().split(" ");
			String result = "";
			for(int i = 0; i < str_arr.length; i++) {
				result += str_arr[i].substring(0, 1).toUpperCase();
			}
			System.out.printf("#%d %s\n", tc, result);
		}
	}
}
