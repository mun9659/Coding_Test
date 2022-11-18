package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [S/W 문제해결 기본] 3일차- String
public class Quiz_01213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			String str_chk = br.readLine();
			String str = br.readLine();
			
			int count = 0;
			for(int i = 0; i <= str.length() - str_chk.length(); i++) {
				if(str.substring(i, i + str_chk.length()).equals(str_chk)) {
					count++;
				}
			}
			sb.append("#").append(tc).append(" ").append(count).append("\n");
		}
		System.out.println(sb);
	}
}