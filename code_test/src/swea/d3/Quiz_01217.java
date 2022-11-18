package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 4일차- 거듭 제곱
public class Quiz_01217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			int count = 0, result = 1;
			while(count++ < p) {
				result *= i;
			}
			
			System.out.printf("#%d %d\n", n, result);
		}
	}
}