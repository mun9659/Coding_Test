package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 수 찾기
public class Quiz_02164 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) que.add(i);
		
		while(que.size() != 1) {
			que.poll();
			int num = que.poll();
			que.offer(num);
		}
		
		System.out.println(que.peek());
	}
}