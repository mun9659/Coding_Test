package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이름 궁합
// 시간이 2444ms라서 좀 더 줄여보자.
// 답을 보면서 바꾼 것은 492ms로 줄여졌다
public class Quiz_15312 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		String A = br.readLine();
		String B = br.readLine();
		int[] alpha = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		for(int i = 0; i < A.length(); i++) {
			sb.append(alpha[A.charAt(i)-'A']).append(alpha[B.charAt(i)-'A']);
		}
		while(sb.length() > 2) {
			sb = cal(sb, sb.length());
		}
		
		System.out.println(sb);
	}
	
	private static StringBuilder cal(StringBuilder c, int len) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < len-1; i++) {
			int a = Character.getNumericValue(c.charAt(i));
			int b = Character.getNumericValue(c.charAt(i+1));
			String sum = String.valueOf((a+b) % 10);
			result.append(sum);
		}
		return result;
	}
}

/*
 * // 시간이 2444ms라서 좀 더 줄여보자.
for(int i = 0; i < A.length(); i++) {
	chk += alpha[A.charAt(i) - 'A'] + "" + alpha[B.charAt(i) - 'A'];
}

while(chk.length() != 2) {
	String n = "";
	for(int i = 0; i < chk.length() - 1; i++) {
		n += (Integer.parseInt(chk.substring(i, i+1)) + Integer.parseInt(chk.substring(i+1, i+2))) % 10;
	}
	chk = n;
}
*/