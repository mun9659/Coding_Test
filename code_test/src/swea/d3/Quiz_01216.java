package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [S/W 문제해결 기본] 3일차- 회문2
// StringBuilder 의 함수 사용법을 알게 되었다
// 다시 복기해놓자
public class Quiz_01216 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[100][100];
			
			for(int i = 0; i < 100; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			int max = 0;
			
			// 가로
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					sb.setLength(0);
					for(int k = 0; k < 100 - j; k++) {
						sb.append(arr[i][j + k]);
						if(isPalindrome(sb)) {
							max = Math.max(max, sb.length());
						}
					}
				}
			}
			
			// 세로
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					sb.setLength(0);
					for(int k = 0; k < 100 - j; k++) {
						sb.append(arr[j + k][i]);
						if(isPalindrome(sb)) {
							max = Math.max(max, sb.length());
						}
					}
				}
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}
	
	public static boolean isPalindrome(StringBuilder sb) {
		
		String str1 = sb.toString();
		String str2 = sb.reverse().toString();
		sb.reverse();
		
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
}