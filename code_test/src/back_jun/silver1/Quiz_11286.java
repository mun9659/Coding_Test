package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 절대값 힙
// 우선순위 큐!
public class Quiz_11286 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> priQue = new PriorityQueue<>((o1, o2) -> {
			if(Math.abs(o1) == Math.abs(o2)) {
				return o1 - o2;
			}
			return Math.abs(o1) - Math.abs(o2);
		});
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x != 0) {
				priQue.add(x);
			} else {
				if(priQue.isEmpty()) sb.append(0+"\n");
				else sb.append(priQue.poll()+"\n");
			}
		}
		System.out.println(sb);
	}
}