package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 핸드폰 번호 궁합
public class Quiz_17202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		String chk = "";
		
		for(int i = 1; i <= 8; i++) {
			chk += String.valueOf(A / (int)Math.pow(10, 8 - i)) + String.valueOf(B / (int)Math.pow(10, 8 - i));
			A %= (int)Math.pow(10, 8 - i);
			B %= (int)Math.pow(10, 8 - i);
		}
		
		while(chk.length() != 2) {
			String n = "";
			for(int i = 0; i < chk.length() - 1; i++) {
				int sum = Integer.parseInt(chk.substring(i, i+1)) + Integer.parseInt(chk.substring(i+1, i+2));
				n += String.valueOf(sum % 10);
			}
			
			chk = n;
		}
		
		System.out.println(chk);
	}
}
