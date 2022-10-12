package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주사위
public class Quiz_01233 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int s3 = Integer.parseInt(st.nextToken());
		int[] dice = new int[s1 + s2 + s3 + 1];
		
		for(int i = 1; i <= s1; i++) {
			for(int j = 1; j <= s2; j++) {
				for(int k  = 1; k <= s3; k++) {
					dice[i+j+k]++;
				}
			}
		}
		
		
		int max = 0, key = 0;
		for(int i = 0; i < dice.length; i++) {
			if(max < dice[i]) max = dice[i];
		}
		for(int i = 0; i < dice.length; i++) {
			if(dice[i] == max) {
				key = i;
				break;
			}
		}
		
		System.out.println(key);
	}
}
