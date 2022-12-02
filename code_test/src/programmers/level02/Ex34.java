package programmers.level02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 주식가격
// 다시 풀기
public class Ex34 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		// int[] prices = {1,2,3,2,3};
		int[] prices = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		
		System.out.println(sol.solution(prices));
	}
	
	public static class Solution {
		 public List<Integer> solution(int[] prices) {
			 List<Integer> answer = new ArrayList<>();
			 Queue<Integer> que = new LinkedList<>();
			 for(int i : prices) {
				 que.add(i);
			 }
			 
			 while(!que.isEmpty()) {
				 int val = que.poll();
				 int count = 0;
				 
				 if(que.isEmpty()) {
					 answer.add(0);
				 }
				 
				 Iterator<Integer> iterator = que.iterator();
				 int comparePrices = 0;
				 while(iterator.hasNext()) {
					 count++;
					 comparePrices = iterator.next();
					 if(val > comparePrices) break;
				 }
				 answer.add(count);
			 }
			 
			 return answer;
	    }
	}
}
