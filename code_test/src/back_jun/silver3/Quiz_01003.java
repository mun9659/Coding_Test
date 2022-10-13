package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
// 시간 제한 0.25초
// 거의 다 해놓고 chk[1][0], chk[1][1] 오타 + return 값을 chk배열로 해서 답을 봄....
public class Quiz_01003 {
	static int[][] chk = new int[41][2];
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		chk[0][0] = 1;
		chk[0][1] = 0;
		chk[1][0] = 0;
		chk[1][1] = 1;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			fib(n);
			System.out.printf("%d %d\n", chk[n][0], chk[n][1]);
		}
	}
	
	static int[] fib(int n) {
		if(chk[n][0] == 0 && chk[n][1] == 0) {
			chk[n][0] = fib(n-1)[0] + fib(n-2)[0];
			chk[n][1] = fib(n-1)[1] + fib(n-2)[1];
		}
		return chk[n];
	}
}