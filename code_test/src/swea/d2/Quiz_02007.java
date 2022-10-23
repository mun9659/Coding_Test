package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 패턴 마디의 길이
public class Quiz_02007 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			for(int j = 1; j < 10; j++) {
				if(str.substring(0, j).equals(str.substring(j, j+j))) {
					result = j;
					break;
				}
			}
			System.out.printf("#%d %d\n", i+1, result);
		}
	}
}