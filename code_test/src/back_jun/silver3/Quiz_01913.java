package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달팽이
// 답을 보고 알았기에 다시 풀기
public class Quiz_01913 {
	
	public static int[] dirX = {0, 1, 0, -1};
	public static int[] dirY = {1, 0, -1, 0};
	
	public static int n, num;
	public static int[] result = new int[2];
	public static int[][] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		num = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		int y = 0, x = 0, index = 0;
		int value = n*n;
		
		arr[0][0] = value;
		
		while(value != 1) {
			int dy = y + dirY[index % 4];
			int dx = x + dirX[index % 4];
			
			if(rangeCheck(dy, dx) && arr[dy][dx] == 0) {
				arr[dy][dx] = --value;
				
				y = dy;
				x = dx;
			} else {
				index++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(num == arr[i][j]) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		sb.append(result[0] + " " + result[1]);
		System.out.println(sb);
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < n;
	}
}
