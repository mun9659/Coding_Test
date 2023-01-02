package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// 숫자야구
// 다시 풀어보자!
public class Quiz_02503 {
	static class BaseBall {
		String num;
		int strike;
		int ball;
		
		public BaseBall(String num, int strike, int ball) {
			this.num = num;
			this.strike = strike;
			this.ball = ball;
		}
	}
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		List<BaseBall> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new BaseBall(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		System.out.println(playBaseBall(list));
	}
	
	public static int playBaseBall(List<BaseBall> list) {
		int answer = 0;
		
		for(int number = 123; number <= 987; number++) {
			
			// 1. 중복되지 않은 3자리 숫자만 출력
			if(hasSameContainsZero(number)) {
				continue;
			}
			
			// 2. 출력된 3자리 숫자에서 스트라이크/볼 개수가 일치하는지 확인
			int allCasePass = 0;
			for(BaseBall baseBall : list) {
				String source = baseBall.num;
				String target = String.valueOf(number);
				
				// 스트라이크/볼 개수 세기
				int strike = countStrike(source, target);
				int ball = countBall(source, target);
				
				if(strike == baseBall.strike && ball == baseBall.ball) {
					allCasePass++;
				} else {
					break;
				}
			}
			
			// 해당하는 케이스일 경우 answer 덧셈
			if(allCasePass == list.size()) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static int countStrike(String source, String target) {
		int strike = 0;
		for(int i = 0; i < 3; i++) {
			if(source.charAt(i) == target.charAt(i)) strike++;
		}
		return strike;
	}
	
	public static int countBall(String source, String target) {
		int ball = 0;
		for(int i = 0; i < 3; i++) {
			if(source.charAt(i) == target.charAt((i + 1) % 3) || source.charAt(i) == target.charAt((i + 2) % 3)) ball++;
		}
		return ball;
	}
	
	public static boolean hasSameContainsZero(int number) {
		String num = String.valueOf(number);
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < num.length(); i++) {
			set.add(num.charAt(i));
		}
		
		return set.contains('0') || set.size() != 3;
	}
}