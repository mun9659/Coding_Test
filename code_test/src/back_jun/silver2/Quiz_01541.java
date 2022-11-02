package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 잃어버린 괄호
public class Quiz_01541 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str_arr = str.split("\\-"); // 마이너스만 구분
		
		int min = 0;
		for(int i = 0; i < str_arr.length; i++) {
			String[] arr = str_arr[i].split("\\+");
			if(i == 0) {
				for(int j = 0; j < arr.length; j++) {
					min += Integer.parseInt(arr[j]);
				}
			}
			else {
				for(int  j = 0; j < arr.length; j++) {
					min -= Integer.parseInt(arr[j]);
				}
			}
		}
		
		System.out.println(min);
	}
}