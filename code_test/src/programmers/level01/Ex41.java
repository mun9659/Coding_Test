package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// 두 개 뽑아서 더하기
public class Ex41 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] numbers = {5, 0, 2, 7};
		
		System.out.println(Arrays.toString(s.solution(numbers)));
	}
	
	static class Solution {
		public int[] solution(int[] numbers) {
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int i = 0; i < numbers.length; i++) {
				for(int j = i + 1; j < numbers.length; j++) {
					Integer sum = numbers[i] + numbers[j];
					if(arr.contains(sum) == false) arr.add(sum); // ArrayList.contains 객체 유무 비교 -> true false 출력
				}
			}
			
			arr.sort(null); // 오름차순 정렬
			
			int[] answer = new int[arr.size()];
			
			for(int i = 0; i < arr.size(); i++) {
				answer[i] = arr.get(i);
			}
			
			return answer;
		}
	}
}