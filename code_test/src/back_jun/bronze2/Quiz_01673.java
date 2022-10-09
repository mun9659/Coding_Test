package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 치킨 쿠폰
// 질문의 답을 봄, Bufferedreadered 사용시 NullPointerException 을 찾아보자
public class Quiz_01673 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		StringTokenizer st;
		// EOF(End of File, 파일의 끝)를 만났을 때, readLine() 메서드를 호출하면 null이 반환
		// 즉 끊임없는 입력을 통할 때 EOF를 만날 수 있기에 이렇게 while문 조건으로 통제한다.
		while((str = br.readLine()) != null) { 
			st = new StringTokenizer(str, " ");
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int result = n;
			while(true) {
				if(n / k > 0) {
					result += n / k;
					n = n / k + n % k;
				} else {
					break;
				}
			}
			System.out.println(result);
		}
	}
}

/*
Scanner sc = new Scanner(System.in);
while(sc.hasNextInt()) {
	int n = sc.nextInt();
	int k = sc.nextInt();
	
	int result = n;
	while(true) {
		if(n / k > 0) {
			result += n / k;
			n = n / k + n % k;
		} else {
			break;
		}
	}
	System.out.println(result);
}
*/