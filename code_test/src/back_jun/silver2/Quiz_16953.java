package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// A -> B
// 메모리 초과
// 다시 풀기
public class Quiz_16953 {
	
	static class Node {
		long number;
		int index;
		
		public Node(long number, int index) {
			this.number = number;
			this.index = index;
		}
	}
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		bfs(a, b);
	}
	
	public static void bfs(long a, long b) {
		Queue<Node> que = new LinkedList<>();
		que.add(new Node(a, 1));
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			long number = node.number;
			int index = node.index;
			
			if(number == b) {
				System.out.println(index);
				return;
			}
			
			for(int i = 1; i <= 2; i++) {
				// 1. 2를 곱한다.
				if(i == 1) {
					long val = number * 2;
					if(val > b) continue;
					que.add(new Node(val, index + 1));
				}
				// 2. 1을 수의 가장 오른쪽에 추가한다.
				else {
					long val = Long.parseLong(String.valueOf(number) + "1");
					if(val > b) continue;
					que.add(new Node(val, index + 1));
				}
			}
		}
		
		if(que.isEmpty()) {
			System.out.println(-1);
			return;
		}
	}
}