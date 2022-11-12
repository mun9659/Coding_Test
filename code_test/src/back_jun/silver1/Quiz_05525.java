package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IOIOI
// 절반 성공
// 답을 찾아보니까 KMP 알고리즘 비슷하지만 문자열의 반복이 2개뿐이라 좀 더 쉽게 표현된다.
// 내보고 다시 풀어보자
public class Quiz_05525 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char s[] = br.readLine().toCharArray();
		
		int result = 0;
		int count = 0;
		
		for(int i = 1; i < m - 1; i++) {
			if(s[i - 1] == 'I' && s[i] == 'O' && s[i+1] == 'I') {
				count++;
				
				if(count == n) {
					count--;
					result++;
				}
				i++;
			} else {
				count = 0;
			}
		}
		
		System.out.println(result);
	}
}