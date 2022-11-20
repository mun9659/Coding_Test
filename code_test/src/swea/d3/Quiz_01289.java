package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 원재의 메모리 복구하기
public class Quiz_01289 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			char[] arr = br.readLine().toCharArray();
			
			char[] new_arr = new char[arr.length];
			for(int i = 0; i < arr.length; i++) {
				new_arr[i] = '0';
			}
			
			int cnt = 0;
			while(true) {
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != new_arr[i]) {
						for(int j = i; j < arr.length; j++) {
							if(arr[i] == '1') {
								new_arr[j] = '1';
							} else {
								new_arr[j] = '0';
							}
						}
						cnt++;
					}
				}
				
				String num1 = new String(arr);
				String num2 = new String(new_arr);
				if(num1.equals(num2)) break;
			}
			sb.append("#"+tc+" "+cnt+"\n");
		}
		System.out.println(sb);
	}
}