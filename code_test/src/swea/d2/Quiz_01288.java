package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 새로운 불면증 치료법
public class Quiz_01288 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int sum = n;
			boolean[] arr = new boolean[10];
			
			while(true) {
				String num = String.valueOf(sum);
				for(int i = 0; i < num.length(); i++) {
					arr[Integer.parseInt(num.substring(i, i+1))] = true;
				}
				boolean chk = false;
				for(int i = 0; i < 10; i++) {
					if(!arr[i]) {
						chk = true;
						break;
					}
				}
				if(!chk) break;
				sum += n;
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
