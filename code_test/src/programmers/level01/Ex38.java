package programmers.level01;

import java.util.ArrayList;

// 문자열 내 마음대로 정렬하기
public class Ex38 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		
		System.out.println(s.solution(strings, n));
	}
	
	static class Solution {
		public String[] solution(String[] strings, int n) {
			String[] answer = new String[strings.length];
			ArrayList<String> arr = new ArrayList<>();
			
			for(int i = 0; i < strings.length; i++) {
				arr.add(strings[i]);
			}
			
			for(int i = 0; i < strings.length; i++) {
				for(int j = i + 1; j < strings.length; j++) {
					String temp = "";
					if(arr.get(i).charAt(n) > arr.get(j).charAt(n)) {
						temp = arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, temp);
					} else if(arr.get(i).charAt(n) == arr.get(j).charAt(n)) {
						if(arr.get(i).compareTo(arr.get(j)) >= 0) { // 사전순서
							temp = arr.get(i);
							arr.set(i, arr.get(j));
							arr.set(j, temp);
						}
					}
				}
			}
			
			for(int i = 0; i < arr.size(); i++) {
				answer[i] = arr.get(i);
			}
			
			return answer;
		}
	}
}
