package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정사각형 판정
public class Quiz_13732 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[n][n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			int chk_cnt = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == '#') chk_cnt++;
				}
			}
			
			int first_x = 0, first_y = 0;
			int last_x = 0, last_y = 0;
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == '#') cnt++;
					if(arr[i][j] == '#' && cnt == 1) {
						first_y = i;
						first_x = j;
					}
					if(arr[i][j] == '#' && cnt == chk_cnt) {
						last_y = i;
						last_x = j;
					}
				}
			}
			
			boolean chk = false;
			
			// 1. 정사각형의 길이인지
			if(last_y - first_y != last_x - first_x) {
				chk = true;
			} else {
				// 2. 처음과 마지막의 인덱스까지 전부 '#'인지
				for(int i = first_y; i <= last_y; i++) {
					for(int j = first_x; j <= last_x; j++) {
						if(arr[i][j] != '#') {
							chk = true;
							break;
						}
					}
					if(chk) break;
				}
			}
			
			if(chk) System.out.printf("#%d %s\n", tc, "no");
			else System.out.printf("#%d %s\n", tc, "yes");
		}
	}
}
