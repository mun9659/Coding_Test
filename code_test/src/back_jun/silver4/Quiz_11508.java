package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 2+1 세일
// 다시 풀기
public class Quiz_11508 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// int로는 안되니 Integer로 가능
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			if(i % 3 == 2) continue;
			result += arr[i];
		}
		System.out.println(result);
	}
}