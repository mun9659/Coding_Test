package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 적고 지우기
public class Quiz_08821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int[] num_arr = new int[10];
			char[] n_arr = br.readLine().toCharArray();
			for(int i = 0; i < n_arr.length; i++) {
				num_arr[n_arr[i] - '0']++;
			}
			int result = 0;
			for(int i = 0; i < num_arr.length; i++) {
				if(num_arr[i] % 2 != 0) result++;
			}
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
