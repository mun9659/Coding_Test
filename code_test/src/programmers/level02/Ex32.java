package programmers.level02;

import java.util.PriorityQueue;

// 더 맵게
// 단 한개가 실패, 왜 일까?, 실패 조건을 앞당겼으면 해결되었다!
public class Ex32 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		int[] scoville = {1, 2, 3};
		// int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 11;
		// int[] scoville = {1, 2, 3, 9, 10, 12};
		// int K = 100000;
		
		System.out.println(sol.solution(scoville, K));
	}
	
	public static class Solution {
		 public int solution(int[] scoville, int K) {
			 int answer = 0;
			 PriorityQueue<Integer> prior_que = new PriorityQueue<>((o1, o2) -> {
				 return o1 - o2;
			 });
			 
			 for(int i = 0; i < scoville.length; i++) {
				 prior_que.offer(scoville[i]);
			 }
			 
			 while(!prior_que.isEmpty()) {
				 int val = prior_que.peek(); // 제일 작은 스코빌 지수
				 
				 if(prior_que.size() == 1 && val < K) return -1;
				 if(val >= K) break;
				 
				 val = prior_que.poll();
				 int plus = prior_que.poll(); // 2번째로 작은 스코빌 지수
				 
				 prior_que.offer(val + (plus * 2));
				 answer++;
			 }
			 
			 return answer;
	    }
	}
}
