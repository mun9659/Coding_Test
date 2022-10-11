package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알고리즘 수업 - 피보나치 수 1
public class Quiz_24416 {
	static int[] arr = new int[41];
	static int cnt1 = 0, cnt2 = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		fib(n);
		fibonacci(n);
		
		System.out.printf("%d %d", cnt1, cnt2);
	}
	
	private static int fib(int n) {
		if(n == 1 || n == 2) {
			cnt1++;
			return 1;
		} else {
			return (fib(n - 1) + fib(n - 2));
		}
	}
	
	private static int fibonacci(int n) {
		arr[1] = 1;
		arr[2] = 1;
		for(int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			cnt2++;
		}
		return arr[n];
	}
}
