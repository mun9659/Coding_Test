package programmers.level01;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// 명예의 전당 (1)
public class Ex55 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();

		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		// int k = 4;
		// int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		
		System.out.println(s.solution(k, score));
	}
	
	static class Solution {
		public List<Integer> solution(int k, int[] score) {
			List<Integer> answer = new ArrayList<>();
			
			PriorityQueue<Integer> priQue = new PriorityQueue<>((o1, o2) -> {
				return o1 - o2;
			});
			
			for(int i = 0; i < score.length; i++) {
				if(priQue.size() == k) {
					if(priQue.peek() < score[i]) {
						priQue.poll();
						priQue.add(score[i]);
					}
				} else {
					priQue.add(score[i]);
				}
				answer.add(priQue.peek());
			}
			
	        return answer;
		}
	}
}
