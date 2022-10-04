package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 꼬리를 무는 숫자 나열
// 정답을 봄
public class Quiz_01598 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		// 행 거리
		int p1 = M % 4;
		int p2 = N % 4;
		
		// 열 거리
		int d1 = M / 4;
		int d2 = N / 4;
		
		// 각 행값이 4일 경우 P값이 0이 아닌 4가 되도록 변경
		if(p1 == 0) {
			p1 = 4;
			d1--;
		}
		if(p2 == 0) {
			p2 = 4;
			d2--;
		}
		
		cnt += Math.abs(p1 - p2) + Math.abs(d1 - d2);
		
		System.out.println(cnt);
		
		br.close();
	}
}
