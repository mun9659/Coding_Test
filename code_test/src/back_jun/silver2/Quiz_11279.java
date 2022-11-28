package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최대 힙
public class Quiz_11279 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 연산의 개수
		PriorityQueue<Integer> prior_que = new PriorityQueue<>((o1, o2) -> {
			// 배열의 큰 값을 제일 앞장서게 하는 sort
			return -(o1 - o2);
		});
		
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(prior_que.isEmpty()) sb.append(0).append("\n");
				else sb.append(prior_que.poll()).append("\n");
			} else {
				prior_que.offer(x);
			}
		}
		System.out.println(sb);
	}
}