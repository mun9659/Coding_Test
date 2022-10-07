package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
public class Quiz_02231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int chk = 1;
		while(chk != N) {
			String str = String.valueOf(chk);
			int sum = chk;
			for(int i = 0; i < str.length(); i++) {
				sum += (Integer.parseInt(str.substring(i, i+1)));
			}
			
			if(sum == N) {
				break;
			} else chk++;
		}
		System.out.println(chk == N ? 0 : chk);
	}
}
