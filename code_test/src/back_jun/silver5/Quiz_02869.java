package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다
// 이것도 시간을 줄여야한다. 
// 정답을 보고 매우 단순한 문제였다... (V - B) % (A - B) 를 확인 했어야 했다...
public class Quiz_02869 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int result = (V - B) / (A - B);
		if((V - B) % (A - B) != 0) result++;
		
		System.out.println(result);
	}
}

	
