package programmers.level01;

import java.util.ArrayList;
import java.util.HashSet;

// 폰켓몬
public class Ex43 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] nums = {3, 3, 3, 2, 2, 2};
		
		System.out.println(s.solution(nums));
	}
	
	static class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			
			HashSet<Integer> arr = new HashSet<>(); // 해시를 사용하여 중복 값을 제거
			
			for(int i = 0; i < nums.length; i++) {
				arr.add(nums[i]);
			}
			
			if(nums.length / 2 <= arr.size()) { // 어차피 최대 가져가는 수는 종류값 / 2 일뿐이므로 arr로 중복 제거한 리스트 크기와 비교만 하면 끝
				answer = nums.length / 2;
			} else {
				answer = arr.size();
			}
			
			return answer;
			/*
			 * 되기는 하지만 종류가 많아지면 시간 초과가 되어 다른 방법을 찾아야한다.
			int answer = 0;
			for(int i = 0; i < nums.length; i++) {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(nums[i]);
				for(int j = i+1; j < nums.length; j++) {
					if(!arr.contains(nums[j]) && arr.size() < nums.length / 2) {
						arr.add(nums[j]);
					}
				}
				if(answer < arr.size()) answer = arr.size();
			}
			
			return answer;
			*/
		}
	}
}
