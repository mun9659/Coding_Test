package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
// 정답을 봄, 거의 맞았는데 조금 수식을 바꿨어야했다
public class Quiz_14916 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(N % 5 != 0) {
			N -= 2;
			cnt++;
			
			if(N < 0) {
				cnt = -1;
				break;
			}
		}
		if(cnt > -1) {
			cnt += N / 5;
		}
		
		System.out.println(cnt);
	}
}

/*
int min = 0;
while(N > 0) {
	if(N >= 5 && (N % 5) % 2 == 0) {
		N -= 5;
		min++;
	} else {
		N -= 2;
		min++;
	}
	if(N == 1) {
		min = -1;
		break;
	}
}
*/