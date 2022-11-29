package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// N번째 큰 수
public class Quiz_02075 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> prior_que = new PriorityQueue<>((o1, o2) -> {
			return -(o1 - o2);
		});
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				prior_que.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		while(n-- > 1) {
			prior_que.poll();
		}
		System.out.println(prior_que.poll());
	}
}