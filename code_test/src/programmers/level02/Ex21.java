package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;

// 튜플
// 가장 빈번한 숫자가 앞에서 나온다.
// 다시 한번더 풀어보자
public class Ex21 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String str = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		String str = "{{1,2,3},{2,1},{2,1,3,4},{2}}";
		// String str = "{{20,111},{111}}";
		// String str = "{{123}}";
		// String str = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public ArrayList<Integer> solution(String s) {
			ArrayList<Integer> answer = new ArrayList<>();
			String[] str_arr = s.split("},");
			
			for(int i = 0; i < str_arr.length; i++) {
				str_arr[i] = str_arr[i].replace("{", "").replace("}", "");
			}
			
			Arrays.sort(str_arr, (o1, o2) -> {
				return o1.length() - o2.length();
			});
			
			for(int i = 0; i < str_arr.length; i++) {
				String[] arr = str_arr[i].split(",");
				for(int j = 0; j < arr.length; j++) {
					int num = Integer.parseInt(arr[j]);
					if(!answer.contains(num)) answer.add(num);
				}
			}
			
			return answer;
		}
	}
}
