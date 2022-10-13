package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 줄 세우기
// 답을 봄, 문제의 내용을 좀 더 면밀히 살피지 못했음
public class Quiz_02605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(-1);
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			int n = Integer.parseInt(st.nextToken());
			arr.add(i - n, i);
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
