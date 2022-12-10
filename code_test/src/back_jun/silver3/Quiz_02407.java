package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 조합
public class Quiz_02407 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n).divide(factorial(n - m).multiply(factorial(m))));
	}
	
	public static BigInteger factorial(int number) {
		BigInteger result = BigInteger.ONE;
		
		for(int i = 1; i <= number; i++) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		
		return result;
	}
}

