package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 점수 계산
public class Quiz_02506 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0, cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int chk = Integer.parseInt(st.nextToken());
			if(chk == 1) {
				cnt += 1;
				sum += cnt;
			} else {
				cnt = 0;
			}
		}
		
		System.out.println(sum);
		
		br.close();
	}
}