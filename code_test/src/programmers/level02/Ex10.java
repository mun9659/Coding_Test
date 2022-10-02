package programmers.level02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 영어 끝말잇기(복기 해야할것!)
public class Ex10 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// int n = 3;
		// String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		// int n = 5;
		// String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int n = 2;
		// String[] words = {"abb", "baa", "ccc", "cda", "abb"};
		String[] words = {"land", "dream", "mom", "mom", "ror"};
		
		System.out.println(Arrays.toString(s.solution(n, words)));
	}
	
	static class Solution {
		public int[] solution(int n, String[] words) {
			int[] answer = {0, 0};
			Map<String, Integer> map = new HashMap<>();
			
			for(int i = 0; i < words.length; i++) {
				if(i != 0) {
					String s1 = words[i - 1]; // 이전 단어
					String s2 = words[i]; // 현재 단어
					
					char last = s1.charAt(s1.length() - 1);
					char first = s2.charAt(0);
					
					// n=2, words = {"land", "dream", "mom", "mom", "ror"}에서 [2,2]가 나타나야하지만 ror의 에러를 먼저 확인해서 [1,3]이 나타나게 됨
					if(map.containsKey(s2) || last != first) { // 단어가 중복이거나 철자가 이어지지 않는 경우(이게 핵심!)
						answer[0] = (i % n) + 1; // 번호
						answer[1] = (i / n) + 1; // 차례
						
						return answer;
					}
				}
				
				map.put(words[i], 1);
			}
			return answer;
		}
	}
}

/*
 * 	1. 1~2개가 계속 틀림, 복잡해서 답을 봄
 * 			int num = 0, turn = 0;
			
			boolean chk = true;
			// 끝말잇기가 안된다면
			for(int i = 0; i < words.length; i++) {
				if(i >= 1) {
					if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)) {
						num = (i % n) + 1;
						turn = (i / n) + 1;
						chk = false;
						break;
					}
				}
			}
			
			if(chk) {
				// 정상으로 할 때 같은 단어가 나오는 경우
				for(int i = 0; i < words.length; i++) {
					for(int j = i+1; j < words.length; j++) {
						if(words[j].equals(words[i]))  {
							num = (j % n) + 1;
							turn = (j / n) + 1;
							chk = true;
							break;
						}
					}
					if(!chk) break;
				}
			}
			
			int[] answer = {num, turn};
			
			return answer;
 */
