package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 간단한 압축 풀기
public class Quiz_01946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append("#"+tc).append("\n");
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				String c = st.nextToken();
				int k = Integer.parseInt(st.nextToken());
				
				while(k != 0) {
					sb.append(c);
					cnt++;
					if(cnt % 10 == 0 && cnt > 0) sb.append("\n");
					k--;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
