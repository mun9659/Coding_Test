package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 추론
// 등차수열 OR 등비수열
public class Quiz_01731 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num_arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			num_arr[i] = Integer.parseInt(br.readLine());
		}
		
		int seq1 = 0, seq2 = 0;
		if(num_arr[2] - num_arr[1] == num_arr[1] - num_arr[0]) {
			System.out.println(num_arr[num_arr.length - 1] + num_arr[1] - num_arr[0]); // 등차수열
		} else {
			seq1 = num_arr[1] - num_arr[0];
			seq2 = (num_arr[2] - num_arr[1]) / (num_arr[1] - num_arr[0]); // 등비수열
			System.out.println(num_arr[num_arr.length - 1] + (int)(seq1 * (Math.pow(seq2, num_arr.length - 1))));
		}
	}
}
