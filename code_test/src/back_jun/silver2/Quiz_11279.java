package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// 최대 힙
// 우선순위 큐(PriorityQueue)
// 우선순위 큐에서 poll() 또는 remove() 할 때 우선순위인 최소값들이 먼저 나온다. 이를 최대값으로 바꾸어라.
// 우선순위 큐 재밌다, 큐를 생성할 때 [우선순위의 기준을 정할 수 있다는 것]
public class Quiz_11279 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
	
		PriorityQueue<Integer> priQue = new PriorityQueue<>(Collections.reverseOrder());
		
		// 이 우선순위는 백준 1181번의 단어정렬에서 사용한 Arrays.sort 변경식이다.
		// 우선순위를 이로 정하고 전부 poll() 처리하니 정상적으로 1181번 답과 동일하게 나왔다.
		PriorityQueue<String> priQue2 = new PriorityQueue<>((o1, o2) -> {
			if(o1.length() == o2.length()) {
				return o1.compareTo(o2);
			} else {
				return o1.length() - o2.length();
			}
		});
		
		for(int i = 0; i < n; i++ ) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				priQue.add(num);
			} else {
				if(priQue.size() == 0) {
					sb.append(0+"\n");
				} else {
					sb.append(priQue.poll() + "\n");
				}
			}
		}
		
		/*
		for(int i = 0; i < n; i++) {
			priQue2.add(br.readLine());
		}
		
		while(priQue2.size() != 0) {
			sb.append(priQue2.poll() + "\n");
		}
		*/
		
		System.out.println(sb);
	}
}