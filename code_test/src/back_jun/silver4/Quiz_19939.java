package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 박 터뜨리기
// 다시 풀어보기
public class Quiz_19939 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 공의 개수
		int k = Integer.parseInt(st.nextToken()); // 팀의 수
		
		int index = 1;
		for(int i = 0; i < k; i++) {
			n -= index++;
			if(n < 0) break;
		}
		
		if(n >= 0) {
			if(n % k > 0) System.out.println(k);
			else System.out.println(k - 1);
		} else {
			System.out.println(-1);
		}
	}
}