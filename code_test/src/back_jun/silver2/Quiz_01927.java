package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최소 힙
// 우선순위 큐(PriorityQueue)
public class Quiz_01927 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> priQue = new PriorityQueue<>();
		
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
		System.out.println(sb);
	}
}