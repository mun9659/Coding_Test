package programmers.level02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// [1차] 뉴스 클러스터링
public class Ex28 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String str1 = "FRANCE";
		// String str2 = "french";
		// String str1 = "handshake";
		// String str2 = "shake hands";
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";
		// String str1 = "E=M*C^2";
		// String str2 = "e=m*c^2";
		
		System.out.println(s.solution(str1, str2));
	}
	
	static class Solution {
		public int solution(String str1, String  str2) {
			StringBuilder sb = new StringBuilder();
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			
			List<String> str_arr1 = new ArrayList<>();
			List<String> str_arr2 = new ArrayList<>();
			
			List<String> union_arr = new ArrayList<>();
			List<String> inter_arr = new ArrayList<>();
			
			for(int i = 0; i < arr1.length - 1; i++) {
				sb.setLength(0);
				if(rangeCheck(arr1[i], arr1[i+1])) {
					sb.append(arr1[i]).append(arr1[i+1]);
					str_arr1.add(sb.toString());
				}
			}
			
			for(int i = 0; i < arr2.length - 1; i++) {
				sb.setLength(0);
				if(rangeCheck(arr2[i], arr2[i+1])) {
					sb.append(arr2[i]).append(arr2[i+1]);
					str_arr2.add(sb.toString());
				}
			}
			
			Collections.sort(str_arr1);
			Collections.sort(str_arr2);
			
			for(String s : str_arr1) {
				if(str_arr2.remove(s)) {
					inter_arr.add(s);
				}
				union_arr.add(s);
			}
			
			for(String s : str_arr2) {
				union_arr.add(s);
			}
			
			double rs = 0;
			if(union_arr.size() == 0) {
				rs = 1;
			} else {
				rs = (double) inter_arr.size() / (double) union_arr.size();
			}
			
 			return (int) (rs * 65536);
		}
		
		public static boolean rangeCheck(char c1, char c2) {
			return c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z';
		}
	}
}
