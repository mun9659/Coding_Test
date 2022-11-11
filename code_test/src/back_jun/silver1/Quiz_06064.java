package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카잉 달력
// 감은 잡았는데 내가 풀었던게 왜 틀렸는지 모르겠다, 다시 풀어보고 비교해보자
public class Quiz_06064 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int ans = -1;
			int cnt = 0;
			int max = m * n / gcd(m, n);
			while(cnt * m < max) {
				if((cnt * m + x - y) % n == 0) {
					ans = cnt * m + x;
					break;
				}
				cnt++;
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}