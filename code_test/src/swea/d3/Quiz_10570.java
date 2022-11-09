package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 제곱 펠린드롬 수
public class Quiz_10570 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int count = 0;
			for(int i = a; i <= b; i++) {
				int sqrt = (int) Math.sqrt(i);
				if(sqrt * sqrt != i) continue;
				
				boolean chk = true;
				String num = String.valueOf(i);
				String sqrt_num = String.valueOf(sqrt);
				for(int j = 0; j < num.length() / 2; j++) {
					if(num.charAt(j) != num.charAt(num.length() - 1 - j)) {
						chk = false;
						break;
					}
				}
				if(!chk) continue;
				for(int j = 0; j < sqrt_num.length() / 2; j++) {
					if(sqrt_num.charAt(j) != sqrt_num.charAt(sqrt_num.length() - 1 - j)) {
						chk = false;
					}
				}
				if(!chk) continue;
				count++;
			}
			System.out.printf("#%d %d\n", tc, count);
		}
	}
}
