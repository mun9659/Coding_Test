package programmers.level02;

import java.util.ArrayList;

// 최대값과 최솟값
public class Ex01 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String str = "1 2 3 4";
		String str = "-1 -1";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public String solution(String s) {
			// 평균 12초로 줄어짐
			String answer = "";
			String[] arr = s.split(" ");
			ArrayList<Integer> num_arr = new ArrayList<>();
			
			for(int i = 0; i < arr.length; i++) {
				num_arr.add(Integer.parseInt(arr[i]));
			}
			
			num_arr.sort(null);
			
			return answer += num_arr.get(0) + " " + num_arr.get(num_arr.size() - 1);
			/*
			 * 평균 15초가 넘길래 수정 해봄
			String answer = "";
			String[] arr = s.split(" ");
			int min = Integer.parseInt(arr[0]), max = Integer.parseInt(arr[0]);
			
			for(int i = 0; i < arr.length; i++) {
				int chk = Integer.parseInt(arr[i]);
				if(min > chk) min = chk;
				if(max < chk) max = chk;
			}
			
			return answer += min + " " + max;
			*/
		}
	}
}


