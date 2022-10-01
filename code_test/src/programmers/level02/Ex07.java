package programmers.level02;

// 피보나치 수
// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
// 정답을 보긴 했지만 접근은 좋았고, 이에 대한 int 범위(-2,147,483,648~ 2,147,483,648)에 대해서 고민만 하면 되는 것, 충분히 넘어가도 됨.
public class Ex07 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 150;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int[] answer = new int[n+1];
			
			for(int i = 0; i <= n; i++) {
				if(i >= 2) answer[i] = (answer[i-2] + answer[i-1]) % 1234567;
				else if(i == 1) answer[i] = 1;
				else if(i == 0) answer[i] = 0;
			}
			
			return answer[n];
		}
	}
}

/*
 * 1. StackOverflowError 발생, int의 범위를 훌쩍 넘겨버려서 에러가 발생한다! 라는 것
public int solution(int n) {
	int answer = 0;
	
	answer = fibonacci(n);
	
	return answer;
}

public int fibonacci(int n) {
	if(n == 0) return 0;
	else if(n == 1) return 1;
	else return fibonacci(n - 2) + fibonacci(n - 1);
}
*/
