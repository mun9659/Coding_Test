package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 암호
public class Quiz_01718 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine(); // 평문
		char[] ch_arr = str.toCharArray();
		
		String lock = br.readLine(); // 암호화 키
		char[] lock_arr = lock.toCharArray();
		
		int lock_len = lock_arr.length;
		for(int i = 0; i < ch_arr.length; i++) {
			if(ch_arr[i] == ' ') ch_arr[i] = ' ';
			else {
				ch_arr[i] = (char) (ch_arr[i] - lock_arr[i % lock_len] <= 0 ? ch_arr[i] - lock_arr[i % lock_len] + 'z' : ch_arr[i] - lock_arr[i % lock_len] + 'a' - 1);
			}	
		}
		
		System.out.println(String.valueOf(ch_arr));
	}
}
