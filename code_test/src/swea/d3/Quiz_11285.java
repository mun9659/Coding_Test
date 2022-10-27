package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다트 게임
public class Quiz_11285 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int sum = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				double len = Math.sqrt(x*x + y*y);
				for(int j = 1; j < arr.length; j++) {
					if(len <= arr[j]) { // 이게 왜 2개의 조건으로 묶을때 허용 안되고 하나로 체크하여 나타날때 정답인걸까 음
						sum += 11 - j;
						break;
					}
				}
			}
			sb.append("#"+tc).append(' ').append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
