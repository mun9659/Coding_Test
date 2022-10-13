package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수열
// 96%에서 틀림 뜸, max 초기값이 문제
public class Quiz_02491 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int up = 1, down = 1, max = 1; // max값이 문제였다
		for(int i = 0; i < N - 1; i++) {
			if(nums[i] < nums[i+1]) {
				up++;
				down = 1;
			}
			else if(nums[i] > nums[i+1]) {
				down++;
				up = 1;
			}
			else {
				up++;
				down++;
			}
			if(max < up) max = up;
			else if(max < down) max = down;
		}
		
		System.out.println(max);
	}
}