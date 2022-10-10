package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Number Game
// 답을 봄, 마지막부터 0을 구하는거로 char 배열을 만들어서 체크했는데 오히려 for문 한개가 더 증가하면서 메모리가 잡아먹어 계속 메모리 초과가 되었음
public class Quiz_01975 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int cnt = 0;
			for(int j = 2; j <= N; j++) {
				int val = N;
				while(true) {
					if(val % j != 0) {
						break;
					}
					cnt++;
					val /= j;
				}
			}
			System.out.println(cnt);
		}
	}
}
