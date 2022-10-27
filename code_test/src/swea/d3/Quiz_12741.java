package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 두 전구
public class Quiz_12741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int cnt = 0, max = Math.max(b, d);
			
			int[] a_arr = new int[max+1];
			int[] b_arr = new int[max+1];
			
			for(int i = a; i < b; i++) {
				a_arr[i] = 1;
			}
			for(int i = c; i < d; i++) {
				b_arr[i] = 1;
			}
			
			System.out.println(Arrays.toString(a_arr));
			System.out.println(Arrays.toString(b_arr));
			
			for(int i = 0; i < max + 1; i++) {
				if(a_arr[i] == 1 && b_arr[i] == 1) cnt++;
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
