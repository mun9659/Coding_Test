package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 진기의 최고급 붕어빵
public class Quiz_01860 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 예약 자격 얻은 사람 수
			int m = Integer.parseInt(st.nextToken()); // 붕어빵 만드는 시간
			int k = Integer.parseInt(st.nextToken()); // 시간 동안 만들 수 있는 붕어빵 개수
			int[] bread = new int[11112];
			int sum = 0;
			for(int i = 1; i < 11112; i++) {
				if(i % m == 0) sum += k;
				bread[i] = sum;
			}
			
			st = new StringTokenizer(br.readLine());
			int[] time = new int[11112];
			for(int i = 0; i < n; i++) {
				time[Integer.parseInt(st.nextToken())]++;
			}
			
			boolean check = false;
			int people = 0;
			for(int i = 0; i < 4; i++) {
				people +=  time[i];
				if(bread[i] - people < 0) {
					check = true;
					break;
				}
			}
			sb.append("#"+tc+" ");
			if(check) sb.append("Impossible");
			else sb.append("Possible");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}