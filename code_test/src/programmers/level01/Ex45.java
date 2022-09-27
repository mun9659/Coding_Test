package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
public class Ex45 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] answers = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(s.solution(answers)));
	}
	
	static class Solution {
		public int[] solution(int[] answers) {
				int[] arr = new int[3];
				int[] supo1 = {1,2,3,4,5};
				int[] supo2 = {2,1,2,3,2,4,2,5};
				int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
				ArrayList<Integer> chk = new ArrayList<>();
				
				for(int i = 0; i < answers.length; i++) {
					if(supo1[i % supo1.length] == answers[i]) arr[0]++;
					if(supo2[i % supo2.length] == answers[i]) arr[1]++;
					if(supo3[i % supo3.length] == answers[i]) arr[2]++;
				}
				
				int max = arr[0] > arr[1] ? (arr[0] > arr[2] ? arr[0] : arr[2]) : (arr[1] > arr[2] ? arr[1] : arr[2]);
				
				for(int i = 0; i < arr.length; i++) {
					if(max == arr[i]) {
						chk.add(i+1);
					}
				}
				
				chk.sort(null);
				int[] answer = new int[chk.size()];
				
				for(int i = 0; i < chk.size(); i++) {
					answer[i] = chk.get(i);
				}
				
				return answer;
		}
	}
}
