package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이상한 술집
public class Quiz_13702 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long k = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		long max = 0;
		for(int i = 0; i < n; i++) {
			long num =  Long.parseLong(br.readLine());
			arr[i] = num;
			max = Math.max(max, num);
		}
		
		long right = max;
		long left = 1;
		long mid = 0;
		
		while(left <= right) {
			
			mid = (right + left) / 2;
			
			long sum = 0;
			for(int i = 0; i < n; i++) {
				sum += arr[i] / mid;
			}
			
			if(sum >= k) left = mid + 1;
			else right = mid - 1;
		}
		
		System.out.println(right);
	}
}