package programmers.level02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 전화목록
// 효율성에서 틀림, phone_book길이가 1 ~ 1000000 이하 이기 때문에
// 답을 보니까 같은 접두어가 나올려면 그냥 Sort를 시켜서 바로 앞뒤로 비교를 해서 체크하면 된다.(효율성 문제)
// 그리고 접두어 비교로 startsWith이란 함수를 사용하면 된다!
public class Ex26 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String[] phone_book = {"119", "97674223", "1195524421"};
		// String[] phone_book = {"123", "456", "789"};
		// String[] phone_book = {"12", "123", "1235","567","88"};
		String[] phone_book = {"987", "1228", "135","987765443211","1288642"};
		System.out.println(s.solution(phone_book));
	}
	
	static class Solution {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
			Arrays.sort(phone_book);
			
			// System.out.println(Arrays.toString(phone_book));
			
			for(int i = 0; i < phone_book.length; i++) {
				if(i == phone_book.length - 1) break;
				if(phone_book[i+1].startsWith(phone_book[i])) {
					answer= false;
					break;
				}
			}
			
			return answer;
		}
	}
}
