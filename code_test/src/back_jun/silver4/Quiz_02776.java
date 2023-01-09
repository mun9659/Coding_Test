package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 암기왕
public class Quiz_02776 {
	
	public static int n, m;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			
			n = Integer.parseInt(br.readLine());
			
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				sb.append(bSearch(num)).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int bSearch(int num) {
		
		int left = 0;
		int right = n - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] < num) left = mid + 1;
			else if(arr[mid] > num) right = mid - 1;
			else {
				return 1;
			}
		}
		return 0;
	}
}