package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 트로피 진열
public class Quiz_01668 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int left_max = 0, right_max = 0;
		int left = 0, right = 0;
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 왼쪽 보기
		for(int i = 0; i < N; i++) {
			if(left_max < arr[i]) {
				left_max = arr[i];
				left++;
			}
		}
		
		sb.append(left).append("\n");
		
		// 오른쪽 보기
		for(int i = N-1; i >= 0; i--) {
			if(right_max < arr[i]) {
				right_max = arr[i];
				right++;
			}
		}
		
		sb.append(right);
		
		System.out.println(sb);
	}
}
