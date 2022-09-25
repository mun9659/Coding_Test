package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// K번째수
public class Ex39 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		int n = 1;
		
		System.out.println(s.solution(array, commands, n));
	}
	
	static class Solution {
		public int[] solution(int[] array, int[][] commands, int n) {
			int[] answer = new int[commands.length];
			
			for(int i = 0; i < commands.length; i++) {
				ArrayList<Integer> arr = new ArrayList<>();
				for(int j = commands[i][0]; j <= commands[i][1]; j++) {
					arr.add(array[j - 1]);
				}
				arr.sort(null);
				
				answer[i] = arr.get(commands[i][2] - 1);
			}
			
			return answer;
		}
	}
}
