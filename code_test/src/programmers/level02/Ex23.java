package programmers.level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 위장
// 2개만 입히는것이 아니다!! 다르게 입히는 거를 구하는 것!!
public class Ex23 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		// String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		System.out.println(s.solution(clothes));
	}
	
	static class Solution {
		public int solution(String[][] clothes) {
			int answer = 0;
			return answer;
		}
	}
}
