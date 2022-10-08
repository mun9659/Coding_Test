package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// Hashing
public class Quiz_15829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] str_arr = str.toCharArray();
		
		BigInteger sum = new BigInteger("0");
		BigInteger a, b, c = new BigInteger("1234567891");;
		for(int i = 0; i < L; i++) {
			int val = str_arr[i] - 'a' + 1;
			a = new BigInteger(String.valueOf(val));
			b = new BigInteger("31");
			
			sum = sum.add(a.multiply(b.pow(i)));
		}
		
		if(sum.compareTo(c) == 1) {
			sum = sum.mod(c);
		}
		
		System.out.println(sum);
	}
}
