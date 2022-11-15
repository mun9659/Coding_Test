package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 코딩 토너먼트
public class Quiz_08673 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int k = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			Queue<Integer> que = new LinkedList<>();
			for(int i = 0; i < Math.pow(2, k); i++) {
				que.add(Integer.parseInt(st.nextToken()));
			}
			
			int sum = 0;
			while(que.size() != 1) {
				int a = que.poll();
				int b = que.poll();
				
				sum += Math.abs(a - b);
				que.add(Math.max(a,b));
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}