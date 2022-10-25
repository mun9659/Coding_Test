package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 숫자가 같은 배수
public class Quiz_14361 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] num_arr1 = new int[10];
			String[] arr1 = String.valueOf(n).split("");
			
			for(int i = 0; i < arr1.length; i++) {
				num_arr1[Integer.parseInt(arr1[i])]++;
			}
			
			
			int num = n;
			int len = String.valueOf(num).length();
			boolean chk = false;
			while(true) {
				int[] num_arr2 = new int[10];
				num += n;
				if(String.valueOf(num).length() != len) break;
				String[] arr2 = String.valueOf(num).split("");
				
				for(int i = 0; i < arr2.length; i++) {
					num_arr2[Integer.parseInt(arr2[i])]++;
				}
				
				if(Arrays.equals(num_arr1, num_arr2)) {
					chk = true;
					break;
				}
			}
			if(chk) System.out.printf("#%d %s\n", tc, "possible");
			else System.out.printf("#%d %s\n", tc, "impossible");
		}
	}
}
