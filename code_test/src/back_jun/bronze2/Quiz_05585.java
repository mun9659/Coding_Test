package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
// 그리디
public class Quiz_05585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 지불할 돈
		
		int cnt = 0;
		while(n != 1000) {
			if(n + 500 <= 1000) {
				cnt++;
				n += 500;
			} else if(n + 100 <= 1000) {
				cnt++;
				n += 100;
			} else if(n + 50 <= 1000) {
				cnt++;
				n += 50;
			} else if(n + 10 <= 1000) {
				cnt++;
				n += 10;
			} else if(n + 5 <= 1000) {
				cnt++;
				n += 5;
			} else if(n + 1 <= 1000) {
				cnt++;
				n += 1;
			}
		}
		System.out.println(cnt);
	}
}
