package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Calkin-Wilf tree 1
public class Quiz_11688 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			char[] str_arr = br.readLine().toCharArray();
			
			long L = 1, R = 1;
			for(int i = 0; i < str_arr.length; i++) {
				if(str_arr[i] == 'L') R += L;
				else L += R;
			}
			System.out.printf("#%d %d %d\n", tc, L, R);
		}
	}
}
