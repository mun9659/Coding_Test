package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 선분 위의 점
// 무조건 다시 풀자!
public class Quiz_11663 {
	
	public static int n, m;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb =  new StringBuilder();
		
		n = Integer.parseInt(st.nextToken()); // 점의 개수
		m = Integer.parseInt(st.nextToken()); // 선분의 개수
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = bSearch(a, b);
			
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int bSearch(int x, int y) {
		int left = 0;
		int right = n - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] > y) right = mid - 1;
			else left = mid + 1;
		}
		int endIndex = right + 1;
		
		left = 0;
		right = n - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		int startIndex = left;
		
		return endIndex - startIndex;
	}
}