package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 플러그
public class Quiz_02010 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += (i != N-1) ? n-1 : n;
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
