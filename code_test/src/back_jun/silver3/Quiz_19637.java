package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// IF문 좀 대신 써줘
// 다시 풀기
public class Quiz_19637 {
	
	public static int n, m;
	public static List<Link> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb =  new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			list.add(new Link(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(bSearch(num)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static String bSearch(int num) {
		
		int left = 0;
		int right = n - 1;
		int mid = 0;
		
		while(left <= right) {
			mid = (left + right) / 2;
			
			if(num > list.get(mid).value) left = mid + 1;
			else right = mid - 1;
		}
		
		return list.get(right + 1).name;
	}
	
	static class Link {
		String name;
		int value;
		
		public Link(String name, int value) {
			this.name = name;
			this.value = value;
		}
	}
}

