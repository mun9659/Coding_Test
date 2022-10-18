package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 덱
public class Quiz_10866 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deq = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "push_front":
					deq.offerFirst(Integer.parseInt(str[1]));
					break;
				case "push_back":
					deq.offerLast(Integer.parseInt(str[1]));
					break;
				case "pop_front":
					if(deq.isEmpty()) {
						System.out.println("-1");
						break;
					}
					System.out.println(deq.pollFirst());
					break;
				case "pop_back":
					if(deq.isEmpty()) {
						System.out.println("-1");
						break;
					}
					System.out.println(deq.pollLast());
					break;
				case "size":
					System.out.println(deq.size());
					break;
				case "empty":
					System.out.println(deq.isEmpty() ? 1 : 0);
					break;
				case "front":
					if(deq.isEmpty()) {
						System.out.println("-1");
						break;
					}
					System.out.println(deq.getFirst());
					break;
				case "back":
					if(deq.isEmpty()) {
						System.out.println("-1");
						break;
					}
					System.out.println(deq.getLast());
					break;
			}
		}
	}
}