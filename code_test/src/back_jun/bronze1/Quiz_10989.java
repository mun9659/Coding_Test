package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 3
// 3초 시간 제한과 512MB 메모리 제한이 있다.
public class Quiz_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 1 <= N <= 10,000,000
		int[] arr = new int[T];
		int[] result = new int[T];
		
		int max = 0;
		for(int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			if (max < num) max = num;
		}
		
		// 이대로 쓰면 아마 시간 초과 될듯
		// 힌트를 보니까 저격하는게 없어서 넘어가긴 한다고 한다. 다른 방법을 찾아보자
		// Arrays.sort(arr);
		
		// 카운팅 정렬(Counting Sort, 시간복잡도가 O(n)이라고 한다)
		int[] count = new int[max];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]-1]++;
		}
		
		// count[n] = count[n-1] + count[n] 
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i -1];
		}
		
		for(int i = arr.length - 1; i >= 0 ; i--) {
			int val = arr[i];
			count[val-1]--;
			result[count[val-1]] = val;
		}
		
		for(int i = 0; i < result.length; i++) {
			sb.append(result[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
