package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
// 브루트포스
// 기준점 : 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다
public class Quiz_01018 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] chess = {"WBWBWBWB", "BWBWBWBW"};
	
		char[][] arr = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= n - 8; i++) {
			for(int j = 0; j <= m - 8; j++) {
				
				int cnt = 0;
				for(int k = i; k < i + 8; k++) {
					int row = i + k;
					int chk_cnt = 0;
					for(int s = j; s < j + 8; s++) {
						if(arr[k][s] != chess[row % 2].charAt(chk_cnt++)) cnt++;
					}
				}
				cnt = Math.min(cnt, 64 - cnt);
				if(min > cnt) min = cnt;
			}
		}
		
		System.out.println(min);
	}
}

/*
1. 틀렸다고 나옴, 왜 그랬을까 하고 정답을 봄
-> 자른 모형의 왼쪽 상단에 있는 값을 기준점을 잡아서 쓸데없이 길어진 것
-> B로 시작하는 경우와 W로 시작하는 경우가 있기에 거기서 체크를 해야했던 것이다.
for(int i = 0; i < n; i++) {
			board[i] = br.readLine().split("");
		}
		
		int min = 32; // 8*8개 중 반절이 최대치 일것임
		
		// 브루프포스 비교
		// 정순
		for(int i = 0; i <= n - 8; i++) {
			for(int j = 0; j <= m - 8; j++) {
				String[][] board_arr = new String[8][8]; // 8 * 8 로 자른 체스판
				String[][] board_arr2 = new String[8][8]; // 8 * 8 로 자른 체스판 정상 비교
				
				int p = 0, q = 0;
				for(int k = i; k < i+8; k++) {
					for(int s = j; s < j+8; s++) {
						board_arr[p][q++] = board[k][s];
					}
					p++;
					q = 0;
				}
				
				int cnt = 0;
				board_arr2[0][0] = board_arr[0][0];
				for(int k = 0; k < 8; k++) {
					if(k > 0) board_arr2[k][0] = board_arr2[k-1][0].equals("B") ? "W" : "B";
					for(int s = 1; s < 8; s++) {
						if(board_arr2[k][s-1].equals("B")) board_arr2[k][s] = "W";
						else board_arr2[k][s] = "B";
					}
				}
				
				for(int k = 0; k < 8; k++) {
					for(int s = 0; s < 8; s++) {
						if(!board_arr[k][s].equals(board_arr2[k][s])) cnt++;
					}
				}
				
				// System.out.println(cnt);
				
				if(min > cnt) min = cnt;
			}
		}
		
		// 역순
		for(int i = n - 1; i >= n - (n - 8 + 1); i--) {
			for(int j = m - 1; j >= m - (m - 8 + 1); j--) {
				String[][] board_arr = new String[8][8]; // 8 * 8 로 자른 체스판
				String[][] board_arr2 = new String[8][8]; // 8 * 8 로 자른 체스판 정상 비교
				
				int p = 0, q = 0;
				for(int k = i; k > i-8; k--) {
					for(int s = j; s > j-8; s--) {
						board_arr[p][q++] = board[k][s];
					}
					p++;
					q = 0;
				}
				
				int cnt = 0;
				board_arr2[0][0] = board_arr[0][0];
				for(int k = 0; k < 8; k++) {
					if(k > 0) board_arr2[k][0] = board_arr2[k-1][0].equals("B") ? "W" : "B";
					for(int s = 1; s < 8; s++) {
						if(board_arr2[k][s-1].equals("B")) board_arr2[k][s] = "W";
						else board_arr2[k][s] = "B";
					}
				}

				for(int k = 0; k < 8; k++) {
					for(int s = 0; s < 8; s++) {
						if(!board_arr[k][s].equals(board_arr2[k][s])) cnt++;
					}
				}
				
				// System.out.println(cnt);
				
				if(min > cnt) min = cnt;
				
				System.out.println(min);
			}
		}
*/