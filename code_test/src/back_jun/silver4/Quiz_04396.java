package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 지뢰 찾기
public class Quiz_04396 {
	public static int n;
	public static boolean mineBoom = false;
	public static int[] dirX = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int[] dirY = {-1, -1, -1, 0, 0, 1, 1, 1};
	public static List<int[]> mine = new ArrayList<>();
	public static char[][] arr, check, result;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		check = new char[n][n];
		result = new char[n][n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			arr[i] = s.toCharArray();
			for(int j = 0; j < n; j++) {
				if(s.charAt(j) == '*') {
					mine.add(new int[] {i, j});
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			check[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(check[i][j] == 'x') {
					mineCheck(i, j);
				} else {
					result[i][j] = '.';
				}
			}
		}
		
		if(mineBoom) {
			for(int i = 0; i < mine.size(); i++) {
				int[] yx = mine.get(i);
				result[yx[0]][yx[1]] = '*';
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void mineCheck(int y, int x) {
		if(mineBoom && arr[y][x] == '*') return;
		if(!mineBoom && arr[y][x] == '*') {
			mineBoom = true;
			return;
		}
		
		int mineCount = 0;
		for(int i = 0; i < 8; i++) {
			int dy = y + dirY[i];
			int dx = x + dirX[i];
			
			if(rangeCheck(dy, dx) && arr[dy][dx] == '*') {
				mineCount++;
			}
		}
		result[y][x] = (char) (mineCount + 48);
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < n;
	}
}