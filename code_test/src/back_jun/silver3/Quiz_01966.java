package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 프린터 큐
// 큐
public class Quiz_01966 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			Queue<Integer> que1 = new LinkedList<>(); // 중요도 큐
			Queue<Integer> que2 = new LinkedList<>(); // 중요도 인덱스 큐
			int[] arr = new int[10]; // 중요도 배열
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				que1.offer(num);
				que2.offer(j);
				arr[num]++;
			}
			
			int result = 0;
			while(true) {
				int max = 0;
				for(int j = arr.length - 1; j >= 0; j--) {
					if(arr[j] != 0) {
						max = j;
						break;
					}
				}
				
				int chk = que1.poll();
				int chk_idx = que2.poll();
				if(max == chk) {
					arr[max]--;
					result++;
					if(chk_idx == m) break;
				} else {
					que1.offer(chk);
					que2.offer(chk_idx);
				}
			}
			System.out.println(result);
		}
		
		
		
		
		
		
	}
}

/*
StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			Queue<Integer> que = new LinkedList<>();
			Queue<Integer> index_que = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] im = new int[10]; // 중요도 체크 배열
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				im[num]++;
				que.offer(num);
				index_que.offer(j);
			}
			
			int cnt = 0;
			while(!que.isEmpty()) {
				int max = 0;
				for(int j = im.length - 1; j >= 1; j--) {
					if(im[j] != 0) {
						max = j;
						break;
					}
				}
				
				int chk1 = que.poll();
				int chk2 = index_que.poll();
				if(chk1 == max) {
					cnt++;
					im[max]--;
					if(chk2 == m) break;
				}
				else {
					que.offer(chk1);
					index_que.offer(chk2);
				}
			}
			System.out.println(cnt);
		}
*/