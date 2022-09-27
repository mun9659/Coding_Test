package programmers.level01;

import java.util.ArrayList;

// 소수 찾기(다시 한번 더 해보기)
public class Ex44 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 5;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			
			// 에라토스테네스의 체 이용(힌트 봄)
			int answer = 0;
			ArrayList<Boolean> arr = new ArrayList<>(n+1);
			
			// 0, 1은 소수가 아니다
			arr.add(false);
			arr.add(false);
			
			for(int i = 2; i <= n; i++) { // 주어진 리스트 크기 전부 소수 처리
				arr.add(true);
			}
			
			for(int i = 2; (i * i) <= n; i++) {
				if(arr.get(i)) {
					for(int j = i * i; j <= n; j += i) arr.set(j, false); // 각 소수에 위치한 값에서 배가 되는 값들을 전부 false로 변경
				}
			}
			
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i)) answer++;
			}
			
			return answer;
			/*
			 * 효율성 문제로 인한 시간초과 에러
			ArrayList<Integer> result = new ArrayList<>();
			
			for(int i = 1; i <= n; i++) {
				ArrayList<Integer> arr = new ArrayList<>();
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) arr.add(j);
					if(arr.size() > 2) break;
				}
				if(arr.size() == 2) result.add(i);
			}
			
			return result.size();
			*/
		}
	}
}
