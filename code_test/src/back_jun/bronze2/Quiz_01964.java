package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오각형, 오각형, ...
public class Quiz_01964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 5;
		
		for(int i = 1; i < N; i++) sum += 5 + (3 * i) - 1 ;
		
		System.out.println(sum % 45678);
	}
}
