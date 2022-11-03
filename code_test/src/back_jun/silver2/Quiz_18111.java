package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 마인크래프트
// 브루트포스
// 추가하면 1초, 제거하면 2초 시간 소모
// 이해는 했되... 다시 푸니까 헷갈림, 또 계속 풀어보기
public class Quiz_18111 {
	
	public static int n, m, b;
	public static int[][] land;
	
	public static int max = 0;
	public static int time = Integer.MAX_VALUE;
	public static int height = 0;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 세로
		m = Integer.parseInt(st.nextToken()); // 가로
		b = Integer.parseInt(st.nextToken()); // 인벤토리의 블록개수
		
		land = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int num = Integer.parseInt(st.nextToken());
				max = Math.max(max, num);
				land[i][j] = num;
			}
		}
		
		brute_force();
		
		System.out.println(time + " " + height);
	}
	
	// 0 ~ 최대 높이까지의 최소시간, 최대높이 구하는 브루트포스 알고리즘
	public static void brute_force() {
		for(int i = 0; i <= max; i++) {
			int[] result = cal(i);
			
			if(result[0] < time) {
				time = result[0];
				height = result[1];
			} else if(result[0] == time && result[1] > height) {
				time = result[0];
				height = result[1];
			}
		}
	}
	
	// 높이에 따른 시간 계산
	public static int[] cal(int h) {
		int block = b;
		int[] result = new int[2]; // 0 : 시간, 1 : 높이
		
		int time = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(land[i][j] > h) { // 제거
					time += (land[i][j] - h) * 2;
					block += land[i][j] - h;
				} else if(land[i][j] < h) { // 추가
					time += h - land[i][j];
					block -= h - land[i][j];
				}
			}
		}
		
		// 인벤토리가 음수값이 나오는 경우 return
		if(block < 0) {
			result[0] = Integer.MAX_VALUE;
			return result;
		}
		
		result[0] = time;
		result[1] = h;
		
		return result;
	}
}

	
