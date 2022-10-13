package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

// 지수연산
public class Quiz_02052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		BigDecimal result = new BigDecimal("2");
		
		System.out.println(String.format("%."+N+"f", BigDecimal.ONE.divide(result.pow(N))));
	}
}
