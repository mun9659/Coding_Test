package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 팩토리얼 0의 개수
public class Quiz_01676 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		
		char[] result = factorial(number).toString().toCharArray();
		
		int cnt = 0;
		for(int i = result.length - 1; i >= 0; i--) {
			if(result[i] == '0') cnt++;
			else break;
		}
		System.out.println(cnt);
	}
	
	public static BigInteger factorial(String number) {
		if(number.equals("0")) return new BigInteger("1");
		BigInteger result = new BigInteger(number);
		int n = Integer.parseInt(number);
		
		while(n-- > 1) {
			result = result.multiply(new BigInteger(String.valueOf(n)));
		}
		
		return result;
	}
}

	
