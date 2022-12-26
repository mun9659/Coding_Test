package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 번데기
public class Quiz_15721 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); // 사람 수
		int t = Integer.parseInt(br.readLine()); // 구하고자 하는 T번째
		int c = Integer.parseInt(br.readLine()); // 0이면 뻔, 1이면 데기
		
		// ‘뻔 – 데기 – 뻔 – 데기 – 뻔(x n번) – 데기(x n번)’
		int count = 0, index = 0, n = 2;
		boolean check = false;
		while(true) {
			// 1. 뻔 - 데기 - 뻔 - 데기 (기본)
			for(int i = 0; i < 4; i++) {
				if(c == 0 && i % 2 == 0) {
					count++;
					if(count == t) {
						check = true;
						break;
					}
				}
				else if(c == 1 && i % 2 == 1) {
					count++;
					if(count == t) {
						check = true;
						break;
					}
				}
				index++;
			}
			
			if(check) break;
			
			// 2. 뻔 (x n번)
			for(int i = 0; i < n; i++) {
				if(c == 0) count++;
				if(count == t) {
					check = true;
					break;
				}
				index++;
			}
			
			if(check) break;
			
			// 2. 데기 (x n번)
			for(int i = 0; i < n; i++) {
				if(c == 1) count++;
				if(count == t) {
					check = true;
					break;
				}
				index++;
			}
			
			if(check) break;
			n++;
		}
		System.out.println(index % a);
	}
}