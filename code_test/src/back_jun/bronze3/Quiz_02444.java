package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 7
// 좀 더 줄여보자
public class Quiz_02444 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2 * N - 1; i++) {
		}
		
		br.close();
	}
}

/*
 * 1. 맘에 안들고 너무 길다, 좀 더 짧게 만들어보자
	for(int i = 0; i < 2 * N - 1; i++) {
			if(i < 2 * N / 2) {
				for(int j = 0; j < 2 * N - 1; j++) {
					if(j >= (2 * N - 1) / 2 - i && j <= (2 * N - 1) / 2 + i) System.out.print("*");
					else if(j < (2 * N - 1) / 2 - i) System.out.print(" ");
				}
			} else {
				// N이 5인 경우 i가 5 ~ 8까지 나타날때 5는 1 ~ 7까지 표시
				for(int j = 0; j < 2 * N - 1; j++) {
					if(j >= (2 * N - 1) / 2 - (N - (i % N)) + 2 && j <= (2 * N - 1) / 2 + (N - (i % N)) - 2) System.out.print("*"); 
					else if(j < (2 * N - 1) / 2 - (N - (i % N)) + 2) System.out.print(" ");
				}
			}
			System.out.println();
		}
*/