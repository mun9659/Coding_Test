package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드
public class Quiz_10815 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int[] n_arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n_arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] result_arr = new int[m];
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int left = 0;
			int right = n;
			
			while(left < right) {
				int mid = (left + right) / 2;
				
				// System.out.println(num + " : " + left + " | " + right + " | " + n_arr[mid]);
				
				if(n_arr[mid] > num) right = mid;
				else if(n_arr[mid] < num) left = mid + 1;
				else {
					result_arr[i] = 1;
					break;
				}
			}
		}
		
		for(int val : result_arr) {
			sb.append(val).append(" ");
		}
		System.out.println(sb);
	}
}