package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 군주제와 공화제
// 다시 또 풀어보자
// 내가 풀었던 알고리즘 문제점
// 1. 그냥 n값의 알고리즘으로 풀어서 index가 0으로 초기화 시켰을 때 인덱스 0에 위치한 1번 도시를 뜻하는건지 아닌지 확인을 할 수가 없었다.
// 2. 영향력이 '같은' 것이 2개 있어야 공화국인거지 영향력을 끼친 나라가 여러개 있다고 공화국이 아니다.
// 3. 반복되는 계산식이 있으니 함수를 사용하여 풀어라
public class Quiz_10993 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
		}
		System.out.println(sb);
	}
}



/*
 // 첫 번째 방법으로 풀었던거(다시 이 방식대로 해보자)
 public static int[] idx_arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine()); // 도시의 개수
			
			int[][] xy_arr = new int[n][2];
			double[] s_arr = new double[n];
			double[][] effect_arr = new double[n][n]; // 각 도시에서 끼치는 영향력 배열
			idx_arr = new int[n]; // 영향력이 큰 유일한 도시에 먹힌 idx 배열
			int[] arr = new int[n]; // 영향력에 먹힌 배열
			
			sb.append("#"+tc).append(' ');
			for(int i = 0; i < n;  i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken()); // x 좌표
				int y = Integer.parseInt(st.nextToken()); // y 좌표
				double s = Double.parseDouble(st.nextToken()); // 군사력
				
				xy_arr[i] = new int[]{x , y};
				s_arr[i] = s;
			}
			
			// 각 도시의 영향력 계산 배열
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j) effect_arr[i][j] = 0;
					else effect_arr[i][j] = s_arr[i] / (Math.pow(xy_arr[j][0] - xy_arr[i][0], 2) +  Math.pow(xy_arr[j][1] - xy_arr[i][1], 2));
				}
			}
			
			// 영향력을 끼치는 도시의 배열 체크와 먹힌 도시 인덱스 체크
			for(int i = 0; i < n; i++) {
				// (i + 1)번째 도시가 다른 도시의 영향력을 미치는 것을 체크하는 것임
				for(int j = 0; j < n; j++) {
					if(effect_arr[i][j] > s_arr[j]) { // 영향력이 해당 도시의 군사력보다 크다면
						arr[j]++; // 추가하되
						if(arr[j] == 1) idx_arr[j] = i; // 도시가 한개 뿐인 경우 영향을 미치는 도시의 idx를 저장한다.
						else idx_arr[j] = 0; // 아니라면 초기화
					}
				}
			}
			
			// System.out.println(Arrays.toString(arr) + " | " + Arrays.toString(idx_arr));
			// idx_arr = new int[]{0, 0, 0, 0, 0, 6, 7, 9, 8, 1};
			
			// 따르는 도시가 다른 도시에 먹힌 경우(DFS)
			for(int i = 0; i < idx_arr.length; i++) {
				idx_arr[i] = dfs(i);
			}
			
			// System.out.println(Arrays.toString(idx_arr));
			
			for(int i = 0; i < n; i++) {
				if(arr[i] == 0) sb.append("K").append(' ');
				else if(arr[i] == 1) sb.append(idx_arr[i] + 1).append(' ');
				else sb.append("D").append(' ');
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static int dfs(int n) {
		int result = idx_arr[n];
		while(true) {
			if(idx_arr[result] != 0) {
				result = dfs(result);
			} else break;
		}
		
		return result;
	}
 */

/*
 // 2번, 정답을 보고 내가 생각하는 방식으로 푼거
public static int[][] city;
	public static int[] control;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine()); // 도시의 개수
			
			city = new int[n+1][3]; // [n][0] : x좌표, [n][1] : y좌표, [n][2] : 군사력
			control = new int[n+1]; // 
			
			for(int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				
				city[i] = new int[] {x, y, s};
			}
			
			// 한번 돌려보고 고찰해보자
			for(int i = 1; i <= n; i++) {
				double maxInfluence = 0; // 가장 영향력이 큰 값, 같은 값이 있다면 공화제가 도입
				for(int j = 1; j <= n; j++) {
					if(i == j) continue;
					double influence = influence(j, i);
					// System.out.println(city[i][2] + " | " + influence + " | " + maxInfluence);
					if(city[i][2] < influence) { // 군사력이 영향력에 비해 낮다면
						if(influence > maxInfluence) {
							maxInfluence = influence;
							control[i] = j;
						} else if(influence == maxInfluence) {
							control[i] = -1;
						}
					}
				}
			}
			
			sb.append("#" + tc + " ");
			
			String result = "";
			for(int i = 1; i <= n; i++) {
				result += getResult(i) + " ";
			}
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
	
	public static double influence(int i, int j) {
		return (double)city[i][2] / (Math.pow(city[j][0] - city[i][0], 2) + Math.pow(city[j][1] - city[i][1], 2));
	}
	
	public static String getResult(int i) {
		if(control[i] == -1) {
			return "D";
		} else if(control[i] == 0) {
			return "K";
		} else {
			return Integer.toString(getAncestor(i));
		}
	}
	
	public static int getAncestor(int i) {
		if(control[i] == -1 || control[i] == 0) return i;
		else return getAncestor(control[i]);
	}
*/