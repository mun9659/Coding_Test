package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

// 타일 장식물
public class Quiz_13301 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Long> arr = new ArrayList<>();
		arr.add(0L);
		arr.add(1L);
		
		// 황금비 덧셈
		for(int i = 2; i <= N; i++) {
			arr.add(arr.get(i-2) + arr.get(i-1));
		}
		
		BigInteger result = new BigInteger("0");
		result = result.add(new BigInteger(String.valueOf((arr.get(N) + arr.get(N-1 < 0 ? 0 : N-1)) * 2 + arr.get(N) * 2)));
		
		System.out.println(result);
		
		br.close();
	}
}