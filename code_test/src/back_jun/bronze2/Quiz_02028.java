package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자기복제수
public class Quiz_02028 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int N_pow = (int) Math.pow(N, 2);
			
			while(N != 0) {
				int a = N % 10;
				int b = N_pow % 10;
				if(a != b) {
					System.out.println("NO");
					break;
				}
				N /= 10;
				N_pow /= 10;
			}
			if(N == 0) System.out.println("YES");
		}
	}
}
