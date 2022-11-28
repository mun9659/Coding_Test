package programmers.level02;

import java.util.ArrayList;
import java.util.List;

// [3차] 압축

// 주차 요금 계산
public class Ex31 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		// String msg = "KAKAO";
		String msg = "TOBEORNOTTOBEORTOBEORNOT";
		// String msg = "ABABABABABABABAB";
		
		System.out.println(sol.solution(msg));
	}
	
	public static class Solution {
		 public List<Integer> solution(String msg) {
			List<Integer> answer = new ArrayList<>();
			List<String> index_arr = new ArrayList<>();
			
			// 1. 사전 색인 번호 초기화(A ~ Z)
			index_arr.add("");
			for(int i = 0; i < 26; i++) {
				char alpha = (char) ('A' + i);
				String x = alpha + "";
				index_arr.add(x);
			}
			
			// 2. 사전 색인 번호 출력 및 추가
			for(int i = 0; i < msg.length();) {
				int length = msg.length() - i + 1;
				
				while(length-- > 0) {
					String check = msg.substring(i, i + length);
					// System.out.println(check);
					if(index_arr.contains(check)) {
						boolean pass = false;
						for(int j = index_arr.size() - 1; j > 0; j--) {
							if(index_arr.get(j).equals(check)) {
								answer.add(j);
								if(i + length + 1 <= msg.length()) {
									index_arr.add(msg.substring(i, i + length + 1));
								}
								pass = true;
								break;
							}
						}
						if(pass) break;
					}
				}
				i += length;
				// System.out.println(index_arr);
			}
			
	        return answer;
	    }
	}
}
