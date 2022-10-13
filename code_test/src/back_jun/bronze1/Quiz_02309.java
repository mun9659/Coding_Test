package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
// 답을 봄
public class Quiz_02309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] small = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			small[i] = num;
			sum += num;
		}
		
		int n = sum - 100; // 과초과하는 난쟁이의 키 값을 뺀다.
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(n - (small[i]+small[j]) == 0) {
					small[i] = 0;
					small[j] = 0;
					Arrays.sort(small);
					for(int k = 2; k < 9; k++) {
						System.out.println(small[k]);
					}
					return;
				}
			}
		}
	}
}
