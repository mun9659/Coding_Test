package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 지능형 기차
public class Quiz_02455 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, pre = 0;
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int ride = Integer.parseInt(st.nextToken());
			
			pre += ride - left;
			if(max < pre) max = pre;
		}
		
		System.out.println(max);
		br.close();
	}
}

	
