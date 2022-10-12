package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나누기
// 이전에 맞쳐놓고 지금은 틀림, 숙지하기
public class Quiz_01075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		N = N / 100 * 100;
		
		while(N % F != 0) {
			N += 1;
		}
		
		System.out.println(String.format("%02d", N % 100));
	}
}
