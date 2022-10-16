package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제
// 정말 간단하게 Queue를 이해하고 있으면 풀 수 있던 거였다
public class Quiz_01158 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= n; i++) que.add(i);
		
		while(que.size() > 1) {
			for(int i = 1; i < k; i++) {
				int value = que.poll();
				que.offer(value);
			}
			
			sb.append(que.poll()).append(", ");
		}
		sb.append(que.poll()).append(">");
		
		System.out.println(sb);
	}
}