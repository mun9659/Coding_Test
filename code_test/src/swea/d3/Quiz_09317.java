package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 석찬이의 받아쓰기
public class Quiz_09317 {
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			char[] answer = br.readLine().toCharArray();
			char[] user = br.readLine().toCharArray();
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				if(answer[i] == user[i]) cnt++;
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
