package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 벌집
public class Quiz_02292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 0, sum1 = 2 + (6 * (i - 1)), sum2 = 1 + (6 * i);
		while(true) {
			if(N >= sum1 && N <= sum2) break;
			else {
				i++;
				sum1 += 6 * (i - 1);
				sum2 += 6 * i;
			}
		}
		
		System.out.println(i+1);
	}
}
