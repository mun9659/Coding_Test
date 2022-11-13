package back_jun.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토
public class Quiz_07576 {
	
	public static int m, n;
	public static int day = 0;
	public static int[][] arr;
	
	public static int[] dirX = {-1, 1, 0, 0};
	public static int[] dirY = {0, 0, -1, 1};
	public static Queue<int[]> xy_que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken()); // 가로
		n = Integer.parseInt(st.nextToken());  // 세로
		
		arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 1) xy_que.add(new int[] {i, j, 0});
				arr[i][j] = num;
			}
		}
		
		bfs();
		if(zeroValueCheck() == false) day = -1;
		System.out.println(day);
	}
	
	public static void bfs() {
		while(!xy_que.isEmpty()) {
			int[] xy_arr = xy_que.poll();
			
			int count = 0;
			for(int i = 0; i < 4; i++) {
				int dy = xy_arr[0] + dirY[i];
				int dx = xy_arr[1] + dirX[i];
				count = xy_arr[2];
				
				if(rangeCheck(dy, dx) && arr[dy][dx] == 0) {
					System.out.println("count : " + count);
					arr[dy][dx] = 1;
					count++;
					xy_que.add(new int[] {dy, dx, count});
				}
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
			System.out.println("day : " + count);
			System.out.println("-------------------------");
			
			if(xy_que.isEmpty()) day = count;
		}
	}
	
	public static boolean rangeCheck(int y, int x) {
		return y >= 0 && y < n && x >= 0 && x < m;
	}
	
	public static boolean zeroValueCheck() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 0) return false;
			}
		}
		return true;
	}
}