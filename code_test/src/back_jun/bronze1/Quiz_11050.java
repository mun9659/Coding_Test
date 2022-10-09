package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 1
public class Quiz_11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
	}
	
	private static long factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
