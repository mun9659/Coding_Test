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
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		// 기본 형식
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String e1, String e2) {
				if(e1.length() == e2.length()) {
					return e1.compareTo(e2);
				} else {
					return e1.length() - e2.length();
				}
			}
		});
		
		// 람다식으로 해보자
		/*
		Arrays.sort(arr, (e1, e2) -> {
			System.out.println(e1 + " | " + e2);
			if(e1.length() == e2.length()) {
				return e1.compareTo(e2); // 사전형식 비교
			} else {
				return e1.length() - e2.length(); // 나머지는 전부 길이 비교
			}
		});
		*/
		
		for(int i = 0; i < n; i++) {
			if(!arr[i].equals(arr[i-1])) System.out.println(arr[i]);
		}
		
		
	}
}

/*
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

*/
