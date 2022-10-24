package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스도쿠 검증
public class Quiz_01974 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			boolean chk = false;
			int[][] arr = new int[9][9];
			
			for(int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 가로 체크
			for(int i = 0; i < 9; i++) {
				boolean[] chk_arr = new boolean[9];
				for(int j = 0; j < 9; j++) {
					chk_arr[arr[i][j] - 1] = true;
				}
				
				for(int j = 0; j < 9; j++) {
					if(!chk_arr[j]) {
						chk = true;
						break;
					}
				}
			}
			
			if(chk) {
				System.out.printf("#%d %d\n", tc, 0);
				continue;
			}
			
			// 세로 체크
			for(int i = 0; i < 9; i++) {
				boolean[] chk_arr = new boolean[9];
				for(int j = 0; j < 9; j++) {
					chk_arr[arr[j][i] - 1] = true;
				}
				
				for(int j = 0; j < 9; j++) {
					if(!chk_arr[j]) {
						chk = true;
						break;
					}
				}
			}
			
			if(chk) {
				System.out.printf("#%d %d\n", tc, 0);
				continue;
			}
			
			// 네모 체크
			for(int i = 0; i < 9; i += 3) {
				for(int j = 0; j < 9; j += 3) {
					
					boolean[] chk_arr = new boolean[9];
					for(int k = i; k < i + 3; k++) {
						for(int s = j; s < j + 3; s++) {
							// System.out.println("k : " + k + ", s : " + s);
							chk_arr[arr[k][s] - 1] = true;
						}
					}
					
					for(int k = 0; k < 9; k++) {
						if(!chk_arr[k]) {
							chk = true;
							break;
						}
					}
					if(chk) break;
				}
				if(chk) break;
			}
			
			if(chk) System.out.printf("#%d %d\n", tc, 0);
			else System.out.printf("#%d %d\n", tc, 1);
		}
	}
}
