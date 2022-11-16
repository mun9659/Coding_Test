package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 계산기
public class Quiz_08338 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			Queue<Integer> que = new LinkedList<>();
			for(int i = 0; i < n; i++) {
				que.add(Integer.parseInt(st.nextToken()));
			}
			
			int start = que.poll();
			while(!que.isEmpty()) {
				int val = que.poll();
				
				int sum = start + val;
				int multi = start * val;
				
				start = Math.max(sum, multi);
			}
			System.out.printf("#%d %d\n", tc, start);
		}
	}
}