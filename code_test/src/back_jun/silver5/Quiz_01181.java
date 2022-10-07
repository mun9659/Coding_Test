package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 단어정렬
// 정답을 봄
public class Quiz_01181 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		// 이게 Arrays.sort 함수와 Comparator를 읽어보아야한다.
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]).append("\n");
		
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}

	
