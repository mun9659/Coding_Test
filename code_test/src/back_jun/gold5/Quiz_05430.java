package back_jun.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// AC
// 시간 초과, 2번 나타남(StringTokenizer 사용해도 나타났음)
// String 을 쓰지 않고 바로 StringBuilder에 넣어야 시간 초과가 안난다.
// 근데 Error처리에서 틀린것인지 안 나온다 왤까? -> D 없이 빈 값의 R을 해도 null이 나타나면 안된다!
// 메모리 초과가 뜸
// 또 하나 간과한게 에러는 무조건 D에서만 작용, R에서 0인 배열을 준다면 null 출력을 시키지 않게 출력을 만들어야 한다!
public class Quiz_05430 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			char[] func = br.readLine().toCharArray(); // R | D 수행하는 함수
			int n = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 개수
			
			Deque<Integer> deque = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), "[],");
			for(int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			boolean directCor = true; // 정상 방향
			boolean errorCheck = false; // 에러 체크
			
			for(int i = 0; i < func.length; i++) {
				if(func[i] == 'R') {
					directCor = !directCor;
				} else {
					// 무슨 방법이 나오든 덱에 있는 값이 없다면
					if(deque.isEmpty()) {
						sb.append("error\n");
						errorCheck = true;
						break;
					}
					if(directCor) {
						deque.pollFirst();
					} else {
						deque.pollLast();
					}
				}
			}
			
			if(errorCheck) continue;
			
			sb.append("[");
			while(!deque.isEmpty()) {
				if(directCor) {
					sb.append(deque.pollFirst());
				} else {
					sb.append(deque.pollLast());
				}
				if(!deque.isEmpty()) sb.append(",");
			}
			sb.append("]\n");
		}
		System.out.println(sb);
	}
}
