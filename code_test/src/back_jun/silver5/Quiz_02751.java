package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 2
// 정답을 봄, 시간 복잡도 O(N^2)를 저격하는 문제라서 이를 우회하는 정렬방법을 찾아야했다.
public class Quiz_02751 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[2000001];
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append("\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	// 퀵 정렬 : 평균 시간 복잡도는 O(NlogN)이고 최악 시간 복잡도는 O(N^2), 최악 시간 복잡도를 가진 O(N^2)를 가지고 있어서 시간 초과
	/*
	private static void quickSort(int[] arrays, int start, int end) {
		if(start >= end) return; // 원소가 1개인 경우 종료
		
		int pivot = start; // 피벗은 첫 번째 원소
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			// 피벗보다 큰 데이터를 찾을 때까지 반복
			while(left <= end && arrays[left] <= arrays[pivot]) left += 1;
			// 피벗보다 작은 데이터를 찾을 때까지 반복
			while(right > start && arrays[right] >= arrays[pivot]) right -= 1;
			
			if(left > right) { // 엇갈렸다면 작은 데이터와 피벗을 교체
				int tmp = arrays[right];
				arrays[right] = arrays[pivot];
				arrays[pivot] = tmp;
			} else { // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
				int tmp = arrays[right];
				arrays[right] = arrays[left];
				arrays[left] = tmp;
			}
			
			// 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
			quickSort(arrays, start, right - 1);
			quickSort(arrays, right + 1, end);
		}
	}
	*/
}

	
