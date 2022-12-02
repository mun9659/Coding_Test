package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 로프
// 착각함
public class Quiz_02217 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			int num = arr[i] * (n - i);
			
			if(max < num) {
				max = num;
			}
		}
		
		System.out.println(max);
	}
}
