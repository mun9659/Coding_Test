package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 5
public class Quiz_02442 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2 * N - 1; j++) {
				if(j >= (2 * N - 1) / 2 - i && j <= (2 * N - 1) / 2 + i) System.out.print("*");
				else if(j < (2 * N-1 ) / 2 - i) System.out.print(" ");
			}
			System.out.println();
		}
		
		br.close();
	}
}
