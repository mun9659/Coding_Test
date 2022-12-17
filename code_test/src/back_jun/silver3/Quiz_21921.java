package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블로그
// 시간 초과, 누적합을 통해 arr를 더하고 빼야한다.
public class Quiz_21921 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0, max = 0, count = 1;
		boolean bol = false;
		for(int i = 0; i < n; i++) {
			if(i >= x - 1) bol = true;
			if(i > x - 1) sum -= arr[i - x];
			sum += arr[i];
			
			if(max == sum && bol) count++;
			else if(sum > max && bol) {
				max = sum;
				count = 1;
			}
		}
		
		if(max == 0) {
			sb.append("SAD");
		} else {
			sb.append(max).append("\n").append(count);
		}
		System.out.println(sb);
	}
}