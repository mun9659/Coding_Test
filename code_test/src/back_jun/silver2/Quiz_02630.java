package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 만들기
// 재귀
// 다시 하기
public class Quiz_02630 {
	
	public static int[][] arr;
	
	public static int white = 0;
	public static int blue = 0;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		for(int i = 0; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		recur(0, 0, n);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	public static void recur(int y, int x, int size) {
		if(colorChk(y, x, size)) {
			if(arr[y][x] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		
		int newSize = size / 2;
		
		recur(y, x, newSize);
		recur(y, x + newSize, newSize);
		recur(y + newSize, x, newSize);
		recur(y + newSize, x + newSize, newSize);
	}
	
	public static boolean colorChk(int y, int x, int size) {
		
		int color = arr[y][x];
		
		for(int i = y; i < y + size; i++) {
			for(int j = x; j < x + size; j++) {
				if(color != arr[i][j]) return false;
			}
		}
		return true;
	}
}