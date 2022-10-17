package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 펠린드롬수
public class Quiz_01259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str = br.readLine()) != null) { 
			if(str.equals("0")) break;
			char[] n_arr = str.toCharArray();
			
			boolean bool = false;
			for(int i = 0; i < n_arr.length / 2; i++) {
				if(n_arr[i] != n_arr[n_arr.length - i - 1]) {
					bool = true;
					break;
				}
			}
			
			if(bool) System.out.println("no");
			else System.out.println("yes");
		}
	}
}
