package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드 2
// 이분 탐색
// upper bound와 lower bound?를 제대로 찾아야한다.
// 다시 또 다시 풀어보자
// 이해는 됐으나 조금 헷갈린다.
public class Quiz_10816 {
	public static int[] n_arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		n_arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n_arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(upper(num) - lower(num)).append(' ');
			// System.out.println(num + " : " + upper(num) + " | " + lower(num));
		}
		System.out.println(sb);
	}
	
	// 찾는 값의 초과하는 첫 번째 인덱스
	public static int upper(int n) {
		int start = 0;
		int end = n_arr.length; // 기존의 이분탐색과 달리 초과하는 값도 찾아야하니 length - 1이 아니다
		
		while(start < end) { // 기존의 이분탐색과 달리 start <= end가 아닌 작을 때만 찾는다.
			int mid = (start + end) / 2;
			if(n >= n_arr[mid]) start = mid + 1;
			else end = mid;
			// System.out.println("upper : " + start + " | " + mid + " | " + end);
		}
		return start;
	}
	
	// 찾는 값의 같거나 초과하는 첫 번째 인덱스
	public static int lower(int n) {
		int start = 0;
		int end = n_arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			if(n > n_arr[mid]) start = mid + 1;
			else end = mid;
			// System.out.println("lower : " + start + " | " + mid + " | " + end);
		}
		return start;
	}
}