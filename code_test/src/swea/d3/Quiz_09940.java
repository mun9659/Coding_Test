package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 순열1
// N의 순열 여부 확인
public class Quiz_09940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine()); // 테스트 케이스
			
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			boolean chk = false;
			for(int i = 0; i < n; i++) {
				if(arr[i] != i + 1) {
					chk = true;
					break;
				}
			}
			if(chk) System.out.printf("#%d %s\n", tc, "No");
			else System.out.printf("#%d %s\n", tc, "Yes");
		}
	}
}
