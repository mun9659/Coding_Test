package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;

// 카펫(잘 모르겠음, 완전 탐색은?)
// 테투리의 1줄은 갈색이고 중앙에는 노란색으로 칠해져있다.
public class Ex09 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int brown = 24;
		int yellow = 24;
		
		System.out.println(Arrays.toString(s.solution(brown, yellow)));
	}
	
	static class Solution {
		public int[] solution(int brown, int yellow) {
			// 첫번째 줄은 무조건 갈색, 이에 맞는 가운데에는 노란색으로 칠해져있다.
			// 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
			// b - 10, y - 2 => [4,3]
			// b - 8, y - 1 => [3,3]
			// b - 24, y - 24 => [8,6]
			int[] answer = new int[2];
			int sum = brown + yellow;
			for(int i = sum; i >= 1; i--) {
				int x = i, y = 0;
				if(sum % x == 0) y = sum / x;
				else continue;
				
				if(x >= y && y >= 3) {
					if((x-2) * (y-2) == yellow) { // 이게 맹점, 가운데에 (x - 2) * (y - 2)의 값어치를 갖고있다. 생각은 하고 있었으나 착각으로 배제해서 나타난 결과, 복기 다시 하자.
						answer[0] = x;
						answer[1] = y;
					}
				}
			}
			
			return answer;
		}
	}
}
