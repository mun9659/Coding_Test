package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 통나무 자르기
public class Quiz_14692 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			long n = Long.parseLong(br.readLine());
			
			if((n - 1) % 2 == 0) {
				System.out.printf("#%d %s\n", tc, "Bob");
			} else {
				System.out.printf("#%d %s\n", tc, "Alice");
			}
		}
	}
}
