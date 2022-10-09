package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 줄 세우기
public class Quiz_01681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int num = 1, cnt = 0;
		while(true) {
			String n = String.valueOf(num);
			if(!n.contains(String.valueOf(L))) cnt++;
			if(cnt == N) break;
			num++;
		}
		System.out.println(num);
	}
}
