package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쉬운 거스름돈
public class Quiz_01970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int tc = 1; tc <= t; tc++) {
			int money = Integer.parseInt(br.readLine());
			sb.append("#"+tc).append("\n");
			
			int idx = 0;
			while(idx != arr.length) {
				sb.append(money / arr[idx]).append(' ');
				money %= arr[idx];
				idx++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
