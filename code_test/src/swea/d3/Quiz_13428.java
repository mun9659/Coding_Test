package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자 조작
public class Quiz_13428 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			String num = String.valueOf(n);
			
			int min = Integer.MAX_VALUE;
			int max = 0;
			for(int i = 0; i < num.length(); i++) {
				for(int j = i; j < num.length(); j++) {
					char[] num_arr = num.toCharArray();
					char temp = num_arr[i];
					num_arr[i] = num_arr[j];
					num_arr[j] = temp;
					
					if(num_arr[0] == '0' && num_arr.length > 1) continue; // 숫자가 0일 때 체크해야한다.
					
					max = Math.max(max, Integer.parseInt(new String(num_arr)));
					min = Math.min(min, Integer.parseInt(new String(num_arr)));
				}
			}
			System.out.printf("#%d %d %d\n", tc, min, max);
		}
	}
}
