package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오목판정
// 브루트포스
public class Quiz_11315 {
	public static int n;
	public static char[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			arr = new char[n][n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			boolean chk = false;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j] == 'o') {
						// 가로 체크
						if(row(i, j)) {
							chk = true;
							break;
						}
						// 세로 체크
						if(col(i, j)) {
							chk = true;
							break;
						}
						// 대각선 체크(좌상우하)
						if(dia1(i, j)) {
							chk = true;
							break;
						}
						// 대각선 체크(우상좌하)
						if(dia2(i, j)) {
							chk = true;
							break;
						}
					}
				}
			}
			if(chk) System.out.printf("#%d %s\n", tc, "YES");
			else System.out.printf("#%d %s\n", tc, "NO");
		}
	}
	
	// 가로 체크
	public static boolean row(int y, int x) {
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if((x + i) <= n - 1 && arr[y][x+i] == 'o') cnt++;
			else break;
		}
		return cnt == 5 ? true : false;
	}
	
	// 세로 체크
	public static boolean col(int y, int x) {
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if((y + i) <= n - 1 && arr[y+i][x] == 'o') cnt++;
			else break;
		}
		
		return cnt == 5 ? true : false;
	}
	
	// 대각선 체크(좌상우하)
	public static boolean dia1(int y, int x) {
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if((y+i) <= n - 1 && (x+i) <= n - 1 && arr[y+i][x+i] == 'o') cnt++;
			else break;
		}
		
		return cnt == 5 ? true : false;
	}
	
	// 대각선 체크(우상좌하)
	public static boolean dia2(int y, int x) {
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if((y+i) <= n - 1 && (x-i) >= 0 && arr[y+i][x-i] == 'o') cnt++;
			else break;
		}
		return cnt == 5 ? true : false;
	}
}
