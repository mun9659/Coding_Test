package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 소수 구하기
// 에라토스테네스의 체(다시 한번 더 복기하기)
public class Quiz_01929 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		ArrayList<Boolean> arr = new ArrayList<>();
		
		arr.add(false);
		arr.add(false); // 0과 1은 소수가 아니다.
		
		for(int i = 2; i <= n; i++) {
			arr.add(true);
		}
		
		for(int i = 2; (i * i) <= n; i++) {
			if(arr.get(i)) for(int j = i * i; j <= n; j += i) arr.set(j, false);
		}
		
		for(int i = m; i <= n; i++)  {
			if(arr.get(i)) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}

/*
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] num_arr = new int[n+1];
		ArrayList<Boolean> arr = new ArrayList<>();
		
		arr.add(false);
		arr.add(false);
		
		for(int i = 0; i < n; i++) {
			num_arr[i] = i;
		}
		
		for(int i = 2; i <= n; i++) {
			arr.add(true);
		}
		
		for(int i = 2; (i * i) <= n; i++) {
			if(arr.get(i)) {
				for(int j = i * i; j <= n; j += i) arr.set(j, false);
			}
		}
		
		for(int i = m; i < num_arr.length; i++) {
			if(arr.get(i)) System.out.println(i);
		}
*/