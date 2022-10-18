package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제 0
public class Quiz_11866 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("");
		Queue<Integer> que = new LinkedList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		
		sb.append("<");
		while(que.size() > 1) {
			for(int i = 0; i < k - 1; i++) {
				int num = que.poll();
				que.offer(num);
			}
			sb.append(que.poll()).append(", ");
		}
		
		sb.append(que.poll()).append(">");
		System.out.println(sb);
	}
}