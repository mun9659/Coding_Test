package programmers.level01;

import java.util.ArrayList;

// 예산
public class Ex34 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] d = {1, 3, 2, 4, 5};
		int budget = 9;
		
		System.out.println(s.solution(d, budget));
	}
	
	static class Solution {
		public int solution(int[] d, int budget) {
			int answer = 0;
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int i = 0; i < d.length; i++) {
				arr.add(d[i]);
			}
			
			arr.sort(null);
			
			int cnt = 0;
			while(arr.size() != cnt) {
				budget -= arr.get(cnt++);
				if(budget >= 0) answer++;
				else break;
			}
			
			return answer;
		}
	}
}
