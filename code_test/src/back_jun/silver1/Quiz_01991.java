package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 트리 순회
// 트리 어렵다
public class Quiz_01991 {
	
	public static class Node {
		int left;
		int right;
		
		public Node(int left, int right) {
			this.left = left;
			this.right = right;
		}
	}
	public static int n;
	public static List<Node>[] tree;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		tree = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			tree[i] = new ArrayList<Node>();
		}
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int parent = st.nextToken().charAt(0) - 'A' + 1;
			int left = st.nextToken().charAt(0) - 'A' + 1;
			int right = st.nextToken().charAt(0) - 'A' + 1;
			
			tree[parent].add(new Node(left, right));
		}
		
		preorder(1);
		sb.append("\n");
		inorder(1);
		sb.append("\n");
		postorder(1);
		System.out.println(sb);
	}
	
	// 전위 순회(노드 -> 왼쪽 -> 오른쪽)
	public static void preorder(int start) {
		for(Node node : tree[start]) {
			int left = node.left;
			int right = node.right;
			
			sb.append((char) (start + 'A' - 1));
			if(left != -18) preorder(left);
			if(right != -18) preorder(right);
		}
	}
	
	// 중위 순회(왼쪽 -> 노드 -> 오른쪽)
	public static void inorder(int start) {
		for(Node node : tree[start]) {
			int left = node.left;
			int right = node.right;
			if(left != -18) inorder(left);
			sb.append((char)(start + 'A' - 1));
			if(right != -18) inorder(right);
		}
	}
	
	// 후위 순회(왼쪽 -> 오른쪽 -> 노드)
	public static void postorder(int start) {
		for(Node node : tree[start]) {
			int left = node.left;
			int right = node.right;
			if(left != -18) postorder(left);
			if(right != -18) postorder(right);
			sb.append((char)(start + 'A' - 1));
		}
	}
}