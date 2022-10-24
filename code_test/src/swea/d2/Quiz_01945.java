package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 간단한 소인수분해
public class Quiz_01945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] arr = {2, 3, 5, 7, 11};
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] result = new int[5];
			
			int idx = 0;
			while(idx != 5) {
				if(n % arr[idx] == 0) {
					result[idx]++;
					n /= arr[idx];
				} else {
					idx++;
				}
			}
			
			sb.append("#"+tc).append(' ');
			for(int i = 0; i < 5; i++) {
				sb.append(result[i]).append(' ');
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
