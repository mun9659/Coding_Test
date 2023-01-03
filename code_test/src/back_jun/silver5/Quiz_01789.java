package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class Quiz_01789 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long s = Long.parseLong(br.readLine());
		
		long sum = 0;
		int count = 0;
		
		for(int i = 1; ; i++) {
			if(sum > s) break;
			sum += i;
			count++;
		}
		System.out.println(count - 1);
	}
}