package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 집합
// 비트마스킹
// 다시 풀어보기
public class Quiz_11723 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int m = Integer.parseInt(br.readLine());
		int cal = 0;
		int empty = 0;
		int all = 1048575;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			String fun = st.nextToken();
			int num = 0;
			if(!(fun.equals("all") || fun.equals("empty"))) {
				num = Integer.parseInt(st.nextToken()) - 1;
			}
			
			switch(fun) {
				case "add" :
					if((cal & (1 << num)) == (1 << num)) continue;
					cal |= (1 << num );
					break;
				case "remove" :
					if((cal & (1 << num)) != (1 << num)) continue;
					cal &= ~(1 << num);
					break;
				case "check" :
					if((cal & (1 << num)) == (1 << num)) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				case "toggle" :
					cal ^= (1 << num);
					break;
				case "all" :
					cal = all;
					break;
				case "empty" :
					cal = empty;
					break;
			}
		}
		System.out.println(sb);
	}
}