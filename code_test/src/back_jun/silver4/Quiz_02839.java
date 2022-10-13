package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class Quiz_02839 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(N % 5 != 0) {
			N -= 3;
			cnt++;
			if(N < 0) {
				cnt = -1;
				break;
			}
		}
		if(N % 5 == 0) cnt += N / 5;
		System.out.println(cnt);
	}
}