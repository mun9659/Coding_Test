package programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

// 프린터
public class Ex25 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int[] priorities = {2, 1, 3, 2};
		// int location = 2;
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		
		System.out.println(s.solution(priorities, location));
	}
	
	static class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			
			Queue<Integer> priorQue = new LinkedList<>();
			Queue<Integer> idxQue = new LinkedList<>();
			
			for(int i = 0; i < priorities.length; i++) {
				priorQue.offer(priorities[i]);
				idxQue.offer(i);
			}
			
			while(true) {
				
				// 1. 현재 우선순위 Queue에서 최대값 찾기
				int max = 0;
				for(int i = 0; i < priorQue.size(); i++) {
					int num = priorQue.poll();
					max = Math.max(max, num);
					priorQue.offer(num);
				}
				
				// 2. 최대값이 아닐 경우 되돌려넣기, 최대값이면 answer 증가
				// index값이 주어진 location과 같다면 빠져나오기
				boolean check = false;
				for(int i = 0; i < priorQue.size(); i++) {
					int num = priorQue.poll();
					int idx = idxQue.poll();
					
					if(num != max) {
						priorQue.offer(num);
						idxQue.offer(idx);
					} else {
						answer++;
						if(location == idx) {
							check = true;
						}
						break;
					}
				}
				if(check) break;
			}
			
			return answer;
		}
	}
}
