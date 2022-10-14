package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세탁소 사장 동혁
// 그리디
public class Quiz_02720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int[] change = new int[4];
			int ch = Integer.parseInt(br.readLine());
			
			while(ch != 0) {
				if(ch >= 25) {
					ch -= 25;
					change[0]++;
				} else if(ch >= 10) {
					ch -= 10;
					change[1]++;
				} else if(ch >= 5) {
					ch -= 5;
					change[2]++;
				} else {
					ch -= 1;
					change[3]++;
				}
			}
			for(int j = 0; j < 4; j++) {
				System.out.print(change[j] + " ");
			}
			System.out.println();
		}
	}
}
