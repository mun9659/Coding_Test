package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전자레인지
// 그리디
public class Quiz_10162 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // 초
		int[] cnt = new int[3]; // 버튼 횟수
		
		if((t % 300) % 60 % 10 != 0) System.out.println("-1");
		else {
			cnt[0] = t / 300;
			t %= 300;
			cnt[1] = t / 60;
			t %= 60;
			cnt[2] = t / 10;
			
			for(int i = 0; i < 3; i++) {
				System.out.print(cnt[i] + " ");
			}
		}
	}
}
