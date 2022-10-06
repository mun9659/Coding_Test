package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 13
public class Quiz_02523 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			sb.append("*".repeat((i % N) == 0 ? N : (i % N)));
			sb.append("\n");
		}
		
		for(int i = N - 1; i > 0; i--) {
			sb.append("*".repeat((i % N) == 0 ? N : (i % N)));
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}