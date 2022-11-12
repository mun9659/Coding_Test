package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카잉 달력
// 감은 잡았는데 내가 풀었던게 왜 틀렸는지 모르겠다, 다시 풀어보고 비교해보자
public class Quiz_06064 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int max = (M * N) / gcd(M, N);
			int count = 1, result = -1;
			while((M * count) <= max) {
				if((x + M * count) % N == y) {
					result = x + M * count;
					break;
				}
				count++;
			}
			System.out.println(result);
		}
	}
	
	// 최대공약수
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}