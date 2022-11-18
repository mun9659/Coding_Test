package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 1일차 - Flatten
public class Quiz_01208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[100];
			for(int i = 0; i < 100; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			while(n-- > 0) {
				int max = 0, min = Integer.MAX_VALUE;
				int max_idx = 0, min_idx = 0;
				for(int i = 0; i < 100; i++) {
					if(max < arr[i]) {
						max = arr[i];
						max_idx = i;
					}
					if(min > arr[i]) {
						min = arr[i];
						min_idx = i;
					}
				}
				arr[max_idx]--;
				arr[min_idx]++;
			}
			
			int max = 0, min = Integer.MAX_VALUE;
			for(int i = 0; i < 100; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.printf("#%d %d\n", tc, max - min);
		}
	}
}