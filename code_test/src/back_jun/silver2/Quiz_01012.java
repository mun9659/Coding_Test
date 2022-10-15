package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유기농 배추
// 그래프 탐색, 그래프 검색, BFS, DFS
// 현재 십자 형태로 구하면 가운데에서 visited[y][x] 가 true 되서 옆에 있는 데이터들이 따로 cnt로 들어가진다.
// 답을 봄, dirX와 dirY를 통해 상하좌우 한번에 체크할 수 있도록 했다.
// 그리고 재귀함수에 들어가는 x, y 위치를 처음에 y, x 로 할 때는 변함이 없는데 x, y로 하니까 정상적으로 돌아왔다, 이유가 뭘까?
public class Quiz_01012 {
	static int m, n; // 가로, 세로
	static int now_x, now_y; // 재귀에서 현재 x, y 위치
	static int cnt; // 개수
	
	static int[][] land; // 땅
	static boolean[][] visited; // 방문 체크
	static int[] dirX = {0, 0, -1, 1}; // 현재 위치에서 좌우 체크
	static int[] dirY = {-1, 1, 0, 0}; // 현재 위치에서 상하 체크
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			land = new int[n][m];
			visited = new boolean[n][m];
			
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				land[y][x] = 1;
			}
			
			cnt = 0;
			for(int s = 0; s < n; s++) {
				for(int p = 0; p < m; p++) {
					if(land[s][p] == 1 && visited[s][p] == false) {
						cnt++;
						warm(s, p);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void warm(int y, int x) {
		visited[y][x] = true;
		
		// System.out.println("접근 노드1 : " + y + " | " + x);
		
		for(int i = 0; i < 4; i++) {
			now_x = x + dirX[i];
			now_y = y + dirY[i];
			// System.out.println("접근 노드2 : " + now_y + " | " + now_x);
			if(Range_chk() && visited[now_y][now_x] == false && land[now_y][now_x] == 1) {
				// System.out.println("접근 노드3 : " + now_y + " | " + now_x);
				warm(now_y, now_x);
			}
		}
		
	}
	
	// 밑에 함수에서 비교하는 수식은 있기에 이와 동일하게 생각해야함
	static boolean Range_chk() {
		return (now_y < n && now_y >= 0 && now_x < m && now_x >= 0);
	}
}


/*
 * 이 방식은 가로와 세로를 각 따로 구하기 때문에 알고리즘에서 어그러져있음, 한번에 계산하는 식을 찾아야함
boolean hasNearCab = false;
// 가로 일자 비교
for(int i = (x - 1 < 0 ? 0 : x - 1); i <= (x + 1 > m - 1 ? m - 1 : x + 1); i++) {
	if(!visited[y][i] && land[y][i] == 1) {
		// System.out.println("가로 비교 : " +  i + " | " + y);
		hasNearCab = true;
		warm(y, i);
		break;
	}
}

// 세로 일자 비교
for(int i = (y - 1 < 0 ? 0 : y -1); i <= (y + 1 > n - 1 ? n - 1 : y + 1); i++) {
	if(!visited[i][x] && land[i][x] == 1) {
		// System.out.println("세로 비교 : " + x + " | " + y);
		hasNearCab = true;
		warm(i, x);
		break;
	}
}


System.out.println(hasNearCab);
if(!hasNearCab) cnt++;
*/

	
