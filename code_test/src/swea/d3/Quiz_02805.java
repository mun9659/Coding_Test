package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 농작물 수확하기
public class Quiz_02805 {
	
	public static int n;
	public static int[] arr;
	public static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				char[] land = br.readLine().toCharArray();
				for(int j = 0; j < n; j++) {
					arr[i][j] = land[j] - '0';
				}
			}
			
			int result = 0;
			for(int i = 0; i < n; i++) {
				int gap = (n / 2) - Math.abs(n / 2 - i);
				for(int j = n / 2 - gap; j < (n / 2 + 1) + gap; j++) {
					result += arr[i][j];
				}
			}
			sb.append("#"+tc+" "+result+"\n");
		}
		System.out.println(sb);
	}
}