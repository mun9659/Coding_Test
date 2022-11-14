package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Summation
public class Quiz_08658 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			String[] str_arr = br.readLine().split(" ");
			
			int max = 0, min = Integer.MAX_VALUE;
			for(int i = 0; i < str_arr.length; i++) {
				int sum = 0;
				for(int j = 0; j < str_arr[i].length(); j++) {
					sum += (str_arr[i].charAt(j) - '0');
				}
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			System.out.printf("#%d %d %d\n", tc, max, min);
		}
	}
}
