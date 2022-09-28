package programmers.level01;

// 다트(답을 봄)
public class Ex48 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String dartResult = "1S2D*3T";
		String dartResult = "1D2S#10S";
		
		System.out.println(s.solution(dartResult));
	}
	
	static class Solution {
		public int solution(String dartResult) {
			int answer = 0;
			
			String temp = ""; // 문자열 내 1번의 점수 저장 변수
			int arr[] = new int[3];
			int idx = 0;
			
			// 점수|보너스|[옵션]
			
			// 1. dartResult 문자열 탐색
			for(int i = 0; i < dartResult.length(); i++) {
				// 1-1. 문자열의 각 문자에 따라 조건 처리
				switch(dartResult.charAt(i)) {
					// 1-2. *인 경우는 자신과 이전의 점수 *2, idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2
					case '*' :
						arr[idx-1] *= 2;
						if(idx > 1) arr[idx-2]*=2;
						break;
					// 1-3. #은 자신의 점수를 음수로 만든다.
					case '#':
						arr[idx-1] *= -1;
						break;
					// 1-4. S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.
					case 'S':
						arr[idx] = (int)Math.pow(Integer.parseInt(temp), 1);
						idx++;
						temp = "";
						break;
					// 1-5. D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.
					case 'D':
						arr[idx] = (int)Math.pow(Integer.parseInt(temp), 2);
						idx++;
						temp = "";
						break;
					// 1-6. T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.  
					case 'T':
						arr[idx] = (int)Math.pow(Integer.parseInt(temp), 3);
						idx++;
						temp = "";
						break;
					// 1-7. 그 외의 정수들은 temp 변수에 저장해 둔다.   
					default:
						temp+=String.valueOf(dartResult.charAt(i));
						break;
				}
			}
			
			// 2. 위 과정을 통해 구한 각 횟수의 점수를 모두 더하면 정답.
			for(int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
			
	        return answer;
		}
	}
}
