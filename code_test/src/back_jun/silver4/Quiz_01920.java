package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 찾기
// 이분 탐색(중요!)
public class Quiz_01920 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			sb.append(BSearch(arr, Integer.parseInt(st.nextToken()))).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 이분 탐색
	public static int BSearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] > num) right = mid - 1;
			else if(arr[mid] < num) left = mid + 1;
			else return 1;
		}
		return 0;
	}
}

/*
public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] n_arr = new int[n];
		StringTokenizer st =  new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n_arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(BSearch(n_arr, num)) System.out.println("1");
			else System.out.println("0");
		}
	}
	
	public static boolean BSearch(int[] arr, int n) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] < n) left = mid + 1;
			else if(arr[mid] > n) right = mid - 1;
			else return true;
		}
		return false;
	}
*/