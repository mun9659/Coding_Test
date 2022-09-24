package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// 같은 숫자는 싫어
public class Ex31 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] arr = {1, 1, 2, 3, 1, 1, 5, 7, 8, 8, 0, 0, 2 , 2};
		
		System.out.println(Arrays.toString(s.solution(arr)));
	}
	
	static class Solution {
		public int[] solution(int[] arr) {
			ArrayList<Integer> result = new ArrayList<>();
			result.add(arr[0]);
			int chk = result.get(0);
			
			for(int i = 1; i < arr.length; i++) {
				if(chk == arr[i]) continue;
				else {
					result.add(arr[i]);
					chk = arr[i];
				}
			}
			
			int[] answer = new int[result.size()];
			for(int i = 0; i < result.size(); i++) {
				answer[i] = result.get(i);
			}
			
			return answer;
		}
	}
}
