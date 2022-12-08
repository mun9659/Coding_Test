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
		long num;
		int count;
		public Node(long num, int count) {
			this.num = num;
			this.count = count;
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
			long val = node.num;
			int count = node.count;
			if(val == b) {
				System.out.println(count);
				return;
			}
			for(int i = 1; i <= 2; i++) {
				// 1. 2를 곱한다.
				long n = 0;
				if(i == 1) {
					n = val * 2;
					if(n > b) continue;
				} 
				// 2. 1을 수의 가장 오른족에 추가한다.
				else {
					n = Long.parseLong(String.valueOf(val) + "1");
					if(n > b) continue;
				}
				que.add(new Node(n, count + 1));
			}
		}
		System.out.println(-1);
		return;
	}
}