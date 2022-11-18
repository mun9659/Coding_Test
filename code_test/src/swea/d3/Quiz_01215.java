package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [S/W 문제해결 기본] 3일차- 회문1
public class Quiz_01215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[8][8];
			
			for(int i = 0; i < 8; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			int count = 0;
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j <= 8 - n; j++) {
					boolean chk = false;
					for(int k = 0; k < n / 2; k++) {
						if(arr[i][j + k] != arr[i][n + j - k - 1]) {
							chk = true;
							break;
						}
					}
					if(!chk) count++;
					
					chk = false;
					for(int k = 0; k < n / 2; k++) {
						if(arr[j + k][i] != arr[n + j - k - 1][i]) {
							chk = true;
							break;
						}
					}
					if(!chk) count++;
				}
			}
			sb.append("#"+tc+" "+count+"\n");
		}
		System.out.println(sb);
	}
}