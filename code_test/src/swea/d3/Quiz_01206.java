package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 1일차 - View
public class Quiz_01206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			for(int i = 2; i < n - 2; i++) {
				int num = arr[i], max = 0;
				for(int j = i - 2; j <= i + 2; j++) {
					if(i == j) continue;
					max = Math.max(max, arr[j]);
				}
				result += (num - max < 0 ? 0 : num - max);
			}
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}