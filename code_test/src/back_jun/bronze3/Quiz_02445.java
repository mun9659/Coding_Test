package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 8
public class Quiz_02445 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N - 1; i >= 0; i--) {
			for(int j = 0; j < 2 * N ; j++) {
				if(j < N - i || j >= N + i) System.out.print("*");
				else if(j >= N- i && j < N + i) System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < 2 * N; j++) {
				if(j < N - i || j >= N + i) System.out.print("*");
				else if(j >= N - i && j < N + i) System.out.print(" ");
			}
			System.out.println();
		}
		
		br.close();
	}
}

	
