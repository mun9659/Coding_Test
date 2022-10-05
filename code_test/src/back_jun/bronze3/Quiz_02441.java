package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 4
public class Quiz_02441 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = N - i; j < N; j++) {
				System.out.print(" ");
			}
			for(int j = N-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		br.close();
	}
}
