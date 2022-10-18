package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 큐
public class Quiz_10845 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "push":
					que.offer(Integer.parseInt(str[1]));
					break;
				case "pop":
					if(que.isEmpty()) {
						System.out.println("-1"); 
						break;
					}
					System.out.println(que.poll());
					break;
				case "size":
					System.out.println(que.size());
					break;
				case "empty":
					System.out.println(que.isEmpty() ? 1 : 0);
					break;
				case "front":
					if(que.isEmpty()) {
						System.out.println("-1"); 
						break;
					}
					System.out.println(que.peek());
					break;
				case "back":
					if(que.isEmpty()) {
						System.out.println("-1"); 
						break;
					}
					int size = que.size();
					for(int j = 1; j <= size; j++) {
						int num = que.poll();
						if(j == size) System.out.println(num);
						que.offer(num);
					}
					break;
			}
		}
	}
}