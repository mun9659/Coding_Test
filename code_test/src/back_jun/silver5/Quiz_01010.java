package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 다리 놓기
// N <= M, 조합(nCr) 사용
public class Quiz_01010 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			System.out.println(factorial(M).divide(factorial(M - N).multiply(factorial(N))));
		}
		br.close();
	}
	
	private static BigInteger factorial(int n) {
		if(n <= 1) {
			return BigInteger.ONE;
		} else {
			return factorial(n - 1).multiply(new BigInteger("" + n));
		}
	}
}

	
