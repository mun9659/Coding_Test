package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 생장점
public class Quiz_01703 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int first = Integer.parseInt(st.nextToken());
			if(first == 0) break;
			else {
				int sum = 1;
				for(int i = 1; i <= first; i++) {
					int factor = Integer.parseInt(st.nextToken());
					int slice = Integer.parseInt(st.nextToken());
					
					sum = (sum * factor) - slice;
				}
				System.out.println(sum);
			}
		}
		
		br.close();
	}
}
