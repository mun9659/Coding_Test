package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 게임
// 해결한 방법은 맞았지만, double과 int로 끝낼수 없었기에 long으로 처리해서 완료했다!
public class Quiz_01072 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long x = Long.parseLong(st.nextToken()); // 현재 게임 횟수
		long y = Long.parseLong(st.nextToken()); // 현재 이긴 게임
		long percent =((y * 100 / x)); // 부동소수점 오차로 인해 변수에 실수형 저장하면 오차가 발생한다.
		
		// 지지 않는다는 가정이기 때문에 이기는 것 만으로 자연수 형태의 승률 퍼센트가 바뀌는 것을 찾아라
		// 아마 Lower bound일듯
		if(percent == 100) System.out.println(-1);
		else {
			long left = 0;
			long right = 1000000000;
			long mid = 0;
			
			while(left < right) {
				mid = (left + right) / 2;
				
				int checkPer = (int) (((y + mid) / (x + mid)) * 100);
				
				if(percent < checkPer) right = mid;
				else left = mid + 1;
			}
			
			System.out.println(right);
		}
	}
}