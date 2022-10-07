package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 소수 찾기
// 힌트를 봄
public class Quiz_01978 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arrays = new int[N];
		ArrayList<Boolean> arr = new ArrayList<>(1001);
		
		int cnt = 0, max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arrays[i] = num;
			if(max < num) max = num;
		}
		
		arr.add(false); // 0 은 소수가 아니다
		arr.add(false); // 1 은 소수가 아니다
		
		// 에라토스테네스의 체(중요!)
		for(int i = 2; i<= max; i++) {
			arr.add(true);
		}
		
		for(int i = 2; (i * i) <= max; i++) {
			if(arr.get(i)) {
				for(int j = i * i; j <= max; j += i) arr.set(j, false);
			}
		}
		
		for(int i = 0; i < arrays.length; i++) {
			if(arr.get(arrays[i])) cnt++;
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}

	
