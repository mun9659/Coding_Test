package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 격자판 칠하기
// 브루트포스 같음?
public class Quiz_14413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			// '#' 은 흑, '.' 은 백, '?' 은 미지수
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			char[][] arr = new char[n][m];
			char[][] cor_arr1 = new char[n][m]; 
			char[][] cor_arr2 = new char[n][m];
			
			for(int i = 0; i < n; i++) {
				String str = br.readLine();
				for(int j = 0; j < m; j++) {
					char chk = str.charAt(j);
					arr[i][j] = chk;
				}
			}
			
			// 2개의 정확한 격자표(한개는 '#' 스타트, 한개는 '.' 스타트)
			cor_arr1[0][0] = '#';
			for(int i = 0; i < n; i++) {
				if(i > 0) {
					if(cor_arr1[i-1][0] == '#') cor_arr1[i][0] = '.';
					else cor_arr1[i][0] = '#';
				}
				for(int j = 1; j < m; j++) {
					if(cor_arr1[i][j - 1] == '#') cor_arr1[i][j] = '.';
					else cor_arr1[i][j] = '#';
				}
			}
			
			cor_arr2[0][0] = '.';
			for(int i = 0; i < n; i++) {
				if(i > 0) {
					if(cor_arr2[i-1][0] == '#') cor_arr2[i][0] = '.';
					else cor_arr2[i][0] = '#';
				}
				for(int j = 1; j < m; j++) {
					if(cor_arr2[i][j - 1] == '#') cor_arr2[i][j] = '.';
					else cor_arr2[i][j] = '#';
				}
			}
			
			boolean chk1 = false, chk2 = false;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(arr[i][j] != '?' && cor_arr1[i][j] != arr[i][j]) {
						chk1 = true;
						break; 
					}
				}
				for(int j = 0; j < m; j++) {
					if(arr[i][j] != '?' && cor_arr2[i][j] != arr[i][j]) {
						chk2 = true;
						break; 
					}
				}
				if(chk1 && chk2) break; // 둘 다 격자판을 만들 수 없다고 판단할 때 나가기
			}
			if(chk1 && chk2) System.out.printf("#%d %s\n", tc, "impossible");
			else System.out.printf("#%d %s\n", tc, "possible");
		}
	}
}

/*
		// arr[0][0]이 있으면 정상적으로 나와야할 격자판(이건 ?가 들어가면 에러가 나타날수 밖에 없다)
			cor_arr[0][0] = arr[0][0];
			for(int i = 0; i < n; i++) {
				if(i > 0) {
					if(cor_arr[i-1][0] == '#') cor_arr[i][0] = '.';
					else cor_arr[i][0] = '#';
				}
				for(int j = 1; j < m; j++) {
					if(cor_arr[i][j - 1] == '#') cor_arr[i][j] = '.';
					else cor_arr[i][j] = '#';
				}
			}
			
			boolean chk = false; 
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(cor_arr[i][j] == arr[i][j] || arr[i][j] == '?') {
						continue;
					} else {
						chk = true;
						break;
					}
				}
				if(chk) break;
			}
			if(chk) System.out.printf("#%d %s\n", tc, "impossible");
			else System.out.printf("#%d %s\n", tc, "possible");
*/