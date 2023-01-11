package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 사탕
public class Quiz_11256 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int j = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				arr[i] = r * c;
			}
			
			Arrays.sort(arr);
			
			int index = n - 1, answer = 0;
			while(j > 0) {
				j -= arr[index--];
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}
}