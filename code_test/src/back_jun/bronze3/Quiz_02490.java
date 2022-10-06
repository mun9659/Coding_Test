package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 윷놀이
public class Quiz_02490 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = {"E", "A", "B", "C", "D"}; // 윷놀이 배 개수
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int c1 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			int c3 = Integer.parseInt(st.nextToken());
			int c4 = Integer.parseInt(st.nextToken());
			
			int[] chk = {c1, c2, c3, c4};
			int cnt = 0;
			for(int j = 0; j < chk.length; j++) {
				if(chk[j] == 0) cnt += 1; 
			}
			System.out.println(s[cnt]);
		}
		
		br.close();
	}
}