package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 어디에 단어가 들어갈 수 있을까
// 정답을 힐끔 봄, 다시 풀어보자
public class Quiz_01979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 배열 크기
			int k = Integer.parseInt(st.nextToken()); // 찾는 단어 길이
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 가로 체크
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				int set = 0;
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == 1) {
						set++;
					} else {
						if(set == k) cnt++;
						set = 0;
					}
				}
				if(set == k) cnt++;
			}
			// 세로 체크
			for(int i = 0; i < n; i++) {
				int set = 0;
				for(int j = 0; j < n; j++) {
					if(arr[j][i] == 1) {
						set++;
					} else {
						if(set == k) cnt++;
						set = 0;
					}
				}
				if(set == k) cnt++;
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
