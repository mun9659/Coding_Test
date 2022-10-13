package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
// 답을 봄. 다시 복기하기
// "무조건 큰 수로 나눈다고 해결되진 않는다."
// 위 이미지의 힌트에서 볼 수 있듯이 10을 큰 수부터 나눠보기 시작하면 10 -> 5 -> 4 -> 2 -> 1 이렇게 4번의 연산이 필요하다. 
// 하지만 정답은 10 -> 9 -> 3 -> 1 로 3이 정답이다.
public class Quiz_01463 {
	// static Integer[] dp;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// dp = new Integer[n+1];
		// dp[0] = dp[1] = 0; // 1이 되는 숫자이기 때문에 0과 1 인덱스에 0 추가
		// System.out.println(cal(n));
		System.out.println(recur(n, 0));
	}
	
	// dp 사용하지 않는 알고리즘 2번
	static int recur(int N, int count) {
		// N이 2 미만인 경우 누적된 count값을 반환
		if (N < 2) {
			return count;
		}
		/*
		 N으로 각각 2와 3으로 나누면 count는 +1에 각 연산의
		 나머지 값을 더해준 것이 된다.
		 나머지 값은 빼기 1했을 때의 count 값과 같기 때문
		*/
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
	}
	
	// dp 이용하는 알고리즘 1번
	/*
	static int cal(int n) {
		if(dp[n] == null) { // 6으로 나뉘어지는 경우(2, 3)
			if(n % 6 == 0) {
				dp[n] = Math.min(cal(n-1), Math.min(cal(n / 3), cal(n / 3))) + 1;
			} else if(n % 3 == 0) { // 3으로 나뉘어지는 경우
				dp[n] = Math.min(cal(n / 3), cal(n - 1)) + 1;
			} else if(n % 2 == 0) { // 2으로 나뉘어지는 경우
				dp[n] = Math.min(cal(n / 2), cal(n - 1)) + 1;
			} else {
				dp[n] = cal(n - 1) + 1;
			}
		}
		return dp[n];
	}
	*/
}