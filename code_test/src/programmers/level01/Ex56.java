package programmers.level01;

import java.util.Stack;

// 크레인 인형뽑기 게임
public class Ex56 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();

		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(s.solution(board, moves));
	}
	
	static class Solution {
		public int solution(int[][] board, int[] moves) {
			int answer = 0;
			
			Stack<Integer> stack = new Stack<>();
			
			for(int idx = 0; idx < moves.length; idx++) {
				
				for(int i = 0; i < board.length; i++) {
					if(board[i][moves[idx] - 1] != 0) {
						stack.add(board[i][moves[idx] - 1]);
						board[i][moves[idx] - 1] = 0;
						break;
					}
				}
				
				System.out.println(stack);
				
				// stack.get(stack.size() - 1) 은 stack.peek()와 같다
				if(stack.size() >= 2 && stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {
					stack.pop();
					stack.pop();
					answer += 2;
				}
			}
			
	        return answer;
		}
	}
}
