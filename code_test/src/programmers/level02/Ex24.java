package programmers.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 기능개발
public class Ex24 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int[] progresses = {93, 30, 55};
		// int[] speeds = {1, 30, 5};
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		System.out.println(s.solution(progresses, speeds));
	}
	
	static class Solution {
		public List<Integer> solution(int[] progresses, int[] speeds) {
			List<Integer> answer = new ArrayList<>();
			Stack<Integer> prog_stack = new Stack<>();
			Stack<Integer> spd_stack = new Stack<>();
			for(int i = progresses.length - 1; i >= 0 ; i--) {
				prog_stack.push(progresses[i]);
				spd_stack.push(speeds[i]);
			}
			
			while(!prog_stack.isEmpty()) {
				int count = 0;
				for(int i = 0; i < prog_stack.size(); i++) {
					int sum = prog_stack.get(i) + spd_stack.get(i) > 100 ? 100 : prog_stack.get(i) + spd_stack.get(i);
					prog_stack.set(i, sum);
				}
				
				while(!prog_stack.isEmpty() && prog_stack.peek() == 100) {
					prog_stack.pop();
					spd_stack.pop();
					count++;
				}
				
				if(count != 0) answer.add(count);
			}
			
			return answer;
		}
	}
}
