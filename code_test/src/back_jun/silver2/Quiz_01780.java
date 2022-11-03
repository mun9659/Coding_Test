package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 종이의 개수
// 재귀에 대해 고찰해보자
public class Quiz_01780 {
	
	public static int[][] arr;
	
	public static int gray = 0;
	public static int white = 0;
	public static int black = 0;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		recur(0, 0, n);
		
		System.out.println(gray);
		System.out.println(white);
		System.out.println(black);
	}
	
	public static void recur(int y, int x, int size) {
		if(colorChk(y , x, size)) {
			if(arr[y][x] == -1) {
				gray++;
			} else if(arr[y][x] == 0) {
				white++;
			} else {
				black++;
			}
			return;
		}
		
		int newSize = size / 3;
		
		// 9갈래
		recur(y, x, newSize);
		recur(y, x + newSize, newSize);
		recur(y, x + newSize * 2, newSize);
		
		recur(y + newSize, x, newSize);
		recur(y + newSize, x + newSize, newSize);
		recur(y + newSize, x + newSize * 2, newSize);
		
		recur(y + newSize * 2, x, newSize);
		recur(y + newSize * 2, x + newSize, newSize);
		recur(y + newSize * 2, x + newSize * 2, newSize);
		
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