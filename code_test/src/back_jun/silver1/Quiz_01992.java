package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쿼드트리
// 분할정복! 이거 재밌음
public class Quiz_01992 {
	
	public static String result = "";
	public static int[][] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			char[] str_arr = br.readLine().toCharArray();
			for(int j = 0; j < n; j++) {
				arr[i][j] = str_arr[j] - '0';
			}
		}
		
		square(0, 0, n);
		
		System.out.println(result);
	}
	
	public static void square(int y, int x, int size) {
		int start = arr[y][x];
		boolean check = true;
		for(int i = y; i < y + size; i++) {
			for(int j = x; j < x+ size; j++) {
				if(start != arr[i][j]) {
					check = false;
					break;
				}
			}
			if(!check) break;
		}
		
		if(check) {
			result += start;
			return;
		}
		
		int newSize = size / 2;
		result += "(";
		square(y, x, newSize);
		square(y, x + newSize, newSize);
		square(y + newSize, x, newSize);
		square(y + newSize, x + newSize, newSize);
		result += ")";
	}
}