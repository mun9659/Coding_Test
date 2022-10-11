package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 파보나치 수 4
public class Quiz_10826 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger[] fibonacci = new BigInteger[10001];
		int n = Integer.parseInt(br.readLine());
		
		// n이 0 ~ 10000까지이기 때문에 BigInteger를 써야한다.
		for(int i = 0; i <= n; i++) {
			if(i < 2) {
				fibonacci[i] = new BigInteger(String.valueOf(i));
			} else {
				fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
			}
		}
		System.out.println(fibonacci[n]);
	}
}