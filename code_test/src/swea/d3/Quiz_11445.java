package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 무한 사전
public class Quiz_11445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			String p = br.readLine().trim();
			String q = br.readLine().trim();
			
			if(q.equals(p+"a")) System.out.printf("#%d %s\n", tc, "N");
			else System.out.printf("#%d %s\n", tc, "Y");
		}
	}
}
