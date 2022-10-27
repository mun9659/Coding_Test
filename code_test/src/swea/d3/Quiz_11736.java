package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평범한 숫자
public class Quiz_11736 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			for(int i = 1; i < n - 1; i++) {
				if((arr[i] < arr[i-1] && arr[i] > arr[i+1]) || (arr[i] > arr[i-1] && arr[i] < arr[i+1])) cnt++; 
			}
			
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
