package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 폭죽쇼
public class Quiz_01773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		boolean[] fire = new boolean[C+1];
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			for(int j = 1; j <= C; j++) {
				if(j % n == 0) fire[j] = true;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < fire.length; i++) {
			if(fire[i]) cnt++;
		}
		System.out.println(cnt);
	}
}
