package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 블로그2
public class Quiz_20365 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] s_arr = br.readLine().toCharArray();
		
		// 1. 전부 파란색 시작
		int count1 = 1;
		
		if(s_arr[0] == 'R') count1 += 1;
		for(int i = 1; i < n; i++) {
			if(s_arr[i - 1] == 'B' && s_arr[i] == 'R') count1 += 1;
		}
		
		// 2. 전부 빨간색 시작
		int count2 = 1;
		
		if(s_arr[0] == 'B') count2 += 1;
		for(int i = 1; i < n; i++) {
			if(s_arr[i - 1] == 'R' && s_arr[i] == 'B') count2 += 1;
		}
		System.out.println(Math.min(count1, count2));
	}
}