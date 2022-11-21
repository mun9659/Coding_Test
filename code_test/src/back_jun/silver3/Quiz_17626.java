package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Four Squares
// 점화식을 도출해야한다. 점화식이 쉽게 생각나지 않는다
// 다시 풀어보자
public class Quiz_17626 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		
		arr[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			arr[i] = n + 1;
		}
		
		// 점화식 구현에 머리를 잘 쓰자.
		for(int i = 2; i < n + 1; i++) {
			for(int j = 1; j * j <= i; j++) {
				arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
			}
		}
		
		System.out.println(arr[n]);
	}
}