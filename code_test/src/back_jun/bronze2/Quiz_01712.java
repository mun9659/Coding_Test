package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 손익분기점
public class Quiz_01712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); // 고정비용
		int B = Integer.parseInt(st.nextToken()); // 생산비용
		int C = Integer.parseInt(st.nextToken()); // 판매비용
		
		System.out.println(B >= C ? -1 : (A / (C -B) + 1));
	}
}
