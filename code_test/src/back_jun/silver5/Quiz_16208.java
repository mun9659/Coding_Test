package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 귀찮음
public class Quiz_16208 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		long[] arr = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			long num = Long.parseLong(st.nextToken());
			sum += num;
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		
		long answer = 0;
		for(int i = 0; i < n - 1; i++) {
			sum -= arr[i];
			answer += arr[i] * sum;
		}
		
		System.out.println(answer);
	}
}