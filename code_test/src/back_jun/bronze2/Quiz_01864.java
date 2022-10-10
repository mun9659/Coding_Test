package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문어 숫자
public class Quiz_01864 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] otco_num = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
		String str = "";
		while((str = br.readLine()) != null) {
			if(str.equals("#")) break;
			char[] str_num = str.toCharArray();
			
			int str_len = str_num.length, sum = 0;
			for(int i = 0; i < str_len; i++) {
				for(int j = 0; j < otco_num.length; j++) {
					if(str_num[i] == otco_num[j]) {
						sum += (j == 8 ? -1 : j) * Math.pow(8, str_len - 1 - i);
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
