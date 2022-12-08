package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 잃어버린 괄호
public class Quiz_01541 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("-");
		
		int result = 0;
		for(int i = 0; i < str.length; i++) {
			String[] str_arr = str[i].split("\\+");
			if(i == 0) {
				for(int j = 0; j < str_arr.length; j++) {
					result += Integer.parseInt(str_arr[j]);
				}
			} else {
				for(int j = 0; j < str_arr.length; j++) {
					result -= Integer.parseInt(str_arr[j]);
				}
			}
		}
		System.out.println(result);
	}
}