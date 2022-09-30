package programmers.level02;

import java.util.ArrayList;
import java.util.Collections;

// 최솟값 만들기
public class Ex04 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		System.out.println(s.solution(A, B));
	}
	
	static class Solution {
		public int solution(int[] A, int[] B) {
			int answer = 0;
			ArrayList<Integer> arr_A = new ArrayList<>();
			ArrayList<Integer> arr_B = new ArrayList<>();
			
			for(int i = 0; i < A.length; i++) {
				arr_A.add(A[i]);
				arr_B.add(B[i]);
			}
			
			arr_A.sort(null);
			arr_B.sort(Collections.reverseOrder());
			
			for(int i = 0; i < arr_A.size(); i++) {
				answer += arr_A.get(i) * arr_B.get(i);
			}
			
			return answer;
		}
	}
}

/*
 * 1번째 시도
		// 배열 -> List로 변환, stream box, collect 다 처음 보니까 주의
		// 내가 생각한것, A를 정순 B를 역순하여 해당 인덱스의 값들을 곱하면 최솟값으로 나타날 것이라 생각
		// 근데 정확성에서 다 통과이지만 효율성에서 시간 초과로 실패가 뜸
		List<Integer> arr_A = Arrays.stream(A).boxed().collect(Collectors.toList());
		List<Integer> arr_B = Arrays.stream(B).boxed().collect(Collectors.toList());
		
		arr_A.sort(null);
		arr_B.sort(Collections.reverseOrder());
		
		for(int i = 0; i < arr_A.size(); i++) {
			answer += (arr_A.get(i) * arr_B.get(i));
		}

	* 2번째 시도
		// 역시 훨씬 더 길어지니까 효율성은 당연히 시간초과
			int max = 0, min = 0;
			
			List<Integer> arr_A = Arrays.stream(A).boxed().collect(Collectors.toList());
			List<Integer> arr_B = Arrays.stream(B).boxed().collect(Collectors.toList());
			
			for(int i = 0; i < A.length; i++ ) {
				min = Collections.min(arr_A);
				max = Collections.max(arr_B);
				
				answer += min * max;
				
				arr_A.remove(arr_A.indexOf(min));
				arr_B.remove(arr_B.indexOf(max));
			}
*/

