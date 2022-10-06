package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 약수 구하기
public class Quiz_02501 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 약수 구할 값
		int K = Integer.parseInt(st.nextToken()); // K번째의 작은 약수
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) arr.add(i);
		}
		
		System.out.println(K > arr.size() ? 0 : arr.get(K - 1));
		
		br.close();
	}
}