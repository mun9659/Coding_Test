package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 정수 제곱근
// 제곱근으로 할 때 왜 틀린지 모르겠다.
// 일단 이분탐색을 이용하는건 못했기에 다시 풀어보기
public class Quiz_02417 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		// 이분탐색
		long start = 0;
		long end = n;
		long result = 0;
		
		while(start <= end) {
			long mid = (start + end) / 2;
			
			if(n <= (long) Math.pow(mid, 2)) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(result);
	}
}