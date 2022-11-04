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
	public static int result;
	public static int cnt = 0;
	public static int n, r, c;
	
	// public static int[] dirX = {0, 1, 0, 1};
	// public static int[] dirY = {0, 0, 1, 1};
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 배열크키
		
		r = Integer.parseInt(st.nextToken()); // 행
		c = Integer.parseInt(st.nextToken()); // 열
		
		int size = 1 << n;
		
		recur(0, 0, size);
		
		System.out.println(cnt);
	}
	
	// 여기서 합계의 변수를 어떻게 정하는가...
	public static void recur(int y, int x, int size) {
		int newSize = size / 2;
		
		// System.out.println(y + " | " + x + " | " + size + " | " +newSize + " | " + cnt);
		
		if(rangeCheck(y, x, newSize)) { // 제1사분면
			cnt += newSize * newSize * 0;
			recur(y, x, newSize);
		} else if(rangeCheck(y, x + newSize, newSize)) { // 제2사분면
			cnt += newSize * newSize * 1;
			recur(y, x + newSize, newSize);
		} else if(rangeCheck(y + newSize, x, newSize)) { // 제3사분면
			cnt += newSize * newSize * 2;
			recur(y + newSize, x, newSize);
		} else  if(rangeCheck(y + newSize, x + newSize, newSize)) { // 제4사분면
			cnt += newSize * newSize * 3;
			recur(y + newSize, x + newSize, newSize);
		}
	}
	
	public static boolean rangeCheck(int y, int x, int size) {
		return r >= y && r < y + size && c >= x && c < x + size;
	}
}