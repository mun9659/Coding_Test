package programmers.level01;

import java.util.Scanner;

// 직사각형 별찍기
public class Ex29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
	/*
	 * solution 으로 따로 만든거
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(s.solution(n, m));
	}
	
	static class Solution {
		public String solution(int n, int m) {
			String answer = "";
			
			for(int i = 0; i < m; i++) { // 세로
				for(int j = 0; j < n; j++) { // 가로
					answer += "*";
				}
				answer += "\n";
			}
			
			return answer;
		}
	}
	*/
}
