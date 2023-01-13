package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 먹을 것인가 먹힐 것인가
public class Quiz_07795 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] a_arr = new int[n + 1];
			int[] b_arr = new int[m + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				a_arr[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= m; i++) {
				b_arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(b_arr);
			
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				
				int result = 0;
				
				int left = 1;
				int right = m;
				int mid = 0;
				
				while(left <= right) {
					mid = (left + right) / 2;
					
					if(b_arr[mid] < a_arr[i]) {
						result = mid;
						left = mid + 1;
					}
					else right = mid - 1;
				}
				sum += result;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}