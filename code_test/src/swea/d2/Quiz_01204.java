package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class Quiz_01204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr =  new int[101];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				arr[num]++;
			}
			
			int max = arr[0], idx = 0;
			for(int i = 1; i < 101; i++) {
				if(arr[i] >= max && i > idx) {
					max = arr[i];
					idx = i;
				}
			}
			sb.append("#"+tc).append(' ').append(idx).append("\n");
		}
		System.out.println(sb);
	}
}
