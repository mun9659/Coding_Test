package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 일요일
public class Quiz_13229 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for(int tc = 1; tc <= t; tc++) {
			String str = br.readLine();
			
			int idx = 0;
			for(int i = 0; i < week.length; i++) {
				if(week[i].equals(str)) idx = 7 - i;
			}
			
			System.out.printf("#%d %d\n", tc, idx == 0 ? 7 : idx);
		}
	}
}
