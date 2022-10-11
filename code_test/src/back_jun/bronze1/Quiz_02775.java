package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부녀회장이 될테야
// 0층의 i호에는 i명이 산다.
public class Quiz_02775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		
		for(int i = 0; i <= 14; i++) {
			for(int j = 1; j <= 14; j++) {
				if(i == 0) arr[i][j] = j;
				else {
					for(int s = 1; s <= j; s++) {
						arr[i][j] += arr[i-1][s];
					}
				}
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(arr[k][n]);
		}
	}
}
