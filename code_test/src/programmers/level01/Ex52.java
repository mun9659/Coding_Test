package programmers.level01;

// [카카오 인턴] 키패드 누르기
public class Ex52 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		
		System.out.println(s.solution(numbers, hand));
	}
	
	static class Solution {
		public String solution(int[] numbers, String hand) {
			String answer = "";
			String[][] dial = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
			String left = "*", right = "#";
			
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
					answer += "L";
					left = String.valueOf(numbers[i]);
				}
				else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
					answer += "R";
					right = String.valueOf(numbers[i]);
				}
				else {
					int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0; // [x1, y1]은 눌러야하는 숫자 위치, [x2, y2]는 왼손 위치, [x3, y3]는 오른손 위치
					for(int j = 0; j < dial.length; j++) {
						for(int k = 0; k < dial[j].length; k++) {
							if(dial[j][k].equals(String.valueOf(numbers[i]))) {
								x1 = j;
								y1 = k;
							}
							if(dial[j][k].equals(left)) {
								x2 = j;
								y2 = k;
							}
							if(dial[j][k].equals(right)) {
								x3 = j;
								y3 = k;
							}
						}
					}
					
					// System.out.println("numbers["+i+"] : " + numbers[i] + ", left : " + left + ", right : " + right);
					// System.out.println("x1 : " + x1 + ", y1 : " + y1);
					// System.out.println("x2 : " + x2 + ", y2 : " + y2);
					// System.out.println("x3 : " + x3 + ", y3 : " + y3);
					
					if(Math.abs((x1-x2)) + Math.abs((y1-y2)) == Math.abs((x1-x3)) + Math.abs((y1-y3))) {
						answer += hand.equals("left") ? "L" : "R";
						if(hand.equals("left")) {
							left = String.valueOf(numbers[i]);
						} else {
							right = String.valueOf(numbers[i]);
						}
					} else if(Math.abs((x1-x2)) + Math.abs((y1-y2)) > Math.abs((x1-x3)) + Math.abs((y1-y3))) {
						answer += "R";
						right = String.valueOf(numbers[i]);
					} else {
						answer += "L";
						left = String.valueOf(numbers[i]);
					}
				}
			}
			
	        return answer;
		}
	}
}
