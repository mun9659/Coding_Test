package back_jun.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토(3차원 버전)
public class Quiz_07569 {
	
	public static int m, n, h;
	public static int day = 0;
	public static int[][][] arr;
	
	public static int[] dirX = {0, 0, -1, 1, 0, 0};
	public static int[] dirY = {0, 0, 0, 0, -1, 1};
	public static int[] dirH = {-1, 1, 0, 0, 0, 0};
	public static Queue<int[]> xyh_que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken()); // 가로
		n = Integer.parseInt(st.nextToken());  // 세로
		h = Integer.parseInt(st.nextToken()); // 높이
		
		arr = new int[h][n][m];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < m; k++) {
					int num = Integer.parseInt(st.nextToken());
					if(num == 1) xyh_que.add(new int[] {i, j, k, 0});
					arr[i][j][k] = num;
				}
			}
		}
		
		bfs();
		if(zeroValueCheck() == false) day = -1;
		System.out.println(day);
	}
	
	public static void bfs() {
		while(!xyh_que.isEmpty()) {
			int[] xyh_arr = xyh_que.poll();
			
			int count = 0;
			for(int i = 0; i < 6; i++) {
				int dh = xyh_arr[0] + dirH[i];
				int dy = xyh_arr[1] + dirY[i];
				int dx = xyh_arr[2] + dirX[i];
				count = xyh_arr[3];
				
				if(rangeCheck(dh, dy, dx) && arr[dh][dy][dx] == 0) {
					arr[dh][dy][dx] = 1;
					count++;
					xyh_que.add(new int[] {dh, dy, dx, count});
				}
			}
			if(xyh_que.isEmpty()) day = count;
		}
	}
	
	public static boolean rangeCheck(int _h, int y, int x) {
		return _h >= 0 && _h < h && y >= 0 && y < n && x >= 0 && x < m;
	}
	
	public static boolean zeroValueCheck() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(arr[i][j][k] == 0) return false;
				}
			}
		}
		return true;
	}
}