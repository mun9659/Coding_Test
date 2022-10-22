package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파스칼의 삼각형
public class Quiz_02005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] pascal = new int[n][n];
			pascal[0][0] = 1;
			for(int j = 1; j < n; j++) {
				pascal[j][0] = pascal[j-1][0];
				pascal[j][n-1] = pascal[j-1][n-1];
				for(int k = 1; k < n; k++) {
					pascal[j][k] = pascal[j-1][k-1] + pascal[j-1][k];
				}
			}
			
			System.out.printf("#%d\n", i+1);
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(pascal[j][k] != 0)System.out.print(pascal[j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
