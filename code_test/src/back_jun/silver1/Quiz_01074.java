package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Z
// 재귀, 분할 정복
// 메모리 초과 뜸
// 질문을 보니까 배열을 생성하지 않고 만들어야 한다고 한다.
// 배열없이 하니까 시간 초과 뜸
// 다른 질문을 보니까 사분면을 이용하여 나타내라고 한다.
// 질문을 보긴 했지만 정답을 맞췄다. 다시 한번 더 풀어보자
public class Quiz_01074 {
	
	public static int n, r, c;
	public static int result = 0;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 배열
		r = Integer.parseInt(st.nextToken()); // 행
		c = Integer.parseInt(st.nextToken());
		
		int size = (int) Math.pow(2, n);
		
		recur(0, 0, size);
		
		System.out.println(result);
	}
	
	public static void recur(int y, int x, int size) {
		int newSize = size / 2;
		
		if(rangeCheck(y, x, newSize)) { // 제1사분면
			result += newSize * newSize * 0;
			recur(y, x, newSize);
		} else if(rangeCheck(y, x + newSize, newSize)) { // 제2사분면
			result += newSize * newSize * 1;
			recur(y, x + newSize, newSize);
		} else if(rangeCheck(y + newSize, x, newSize)) { // 제3사분면
			result += newSize * newSize * 2;
			recur(y + newSize, x, newSize);
		} else if(rangeCheck(y + newSize, x + newSize, newSize)) { // 제4사분면
			result += newSize * newSize * 3;
			recur(y + newSize, x + newSize, newSize);
		}
	}
	
	public static boolean rangeCheck(int y, int x, int newSize) {
		return r >= y && r < y + newSize && c >= x && c < x + newSize;
	}
}