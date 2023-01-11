package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 뒤집기
public class Quiz_01439 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] arr = new int[2];
		char check = str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == check) continue;
			else {
				arr[check - '0']++;
				check = str.charAt(i);
			}
		}
		arr[check - '0']++;
		
		System.out.println(Math.min(arr[0], arr[1]));
	}
}