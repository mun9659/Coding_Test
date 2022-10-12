package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 투자의 귀재 배주형
// 답을 봄
public class Quiz_19947 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		long[] money = new long[Y+1];
		money[0] = H;
		
		for(int i = 1; i <= Y; i++) {
			money[i] = (long)Math.floor(money[i-1] * 1.05);
			if(i >= 3) money[i] = Math.max((long)Math.floor(money[i-3] * 1.2), money[i]);
			if(i >= 5) money[i] = Math.max((long)Math.floor(money[i-5] * 1.35), money[i]);
		}
		System.out.println(money[Y]);
	}
}
