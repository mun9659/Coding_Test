package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기
// 딱 봐도 삽입 정렬로는 시간 초과 나올거라 생각했음
// BufferedReader 사용하면 StringBuilder 로 무조건 출력하라!(대용량인 경우가 많아 SB로 출력을 해야 시간 초과가 안난다.)
public class Quiz_11650 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
}

/*
 * 1. 삽입정렬 시간 초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr_x = new ArrayList<>();
		ArrayList<Integer> arr_y = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr_x.add(x);
			arr_y.add(y);
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr_x.get(i) > arr_x.get(j)) {
					int temp1 = arr_x.get(i), temp2 = arr_y.get(i);
					arr_x.set(i, arr_x.get(j));
					arr_x.set(j, temp1);
					arr_y.set(i, arr_y.get(j));
					arr_y.set(j, temp2);
				} else if(arr_x.get(i) == arr_x.get(j)) {
					if(arr_y.get(i) > arr_y.get(j)) {
						int temp1 = arr_x.get(i), temp2 = arr_y.get(i);
						arr_x.set(i, arr_x.get(j));
						arr_x.set(j, temp1);
						arr_y.set(i, arr_y.get(j));
						arr_y.set(j, temp2);
					}
				}
			}
		}
		
		for(int i = 0; i < arr_x.size(); i++) {
			System.out.printf("%d %d\n", arr_x.get(i), arr_y.get(i));
		}
		
		br.close();
		
	// 2. 정답
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 예상은 했지만 람다식은 예상 못함
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
*/