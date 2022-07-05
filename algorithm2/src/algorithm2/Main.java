package algorithm2;

import java.util.*;

public class Main {
	static int V, E, min = 0;
	static Graph graph;
	static boolean[] visited;
	static ArrayList<Edge> mst;

	public static void main(String[] args) {
		V = 7;
		E = 9;
		visited = new boolean[V + 1];
		mst = new ArrayList<>();
		graph = new Graph(V);

		graph.AddEdge(1, 6, 10);
		graph.AddEdge(1, 2, 25);
		graph.AddEdge(2, 3, 16);
		graph.AddEdge(2, 7, 15);
		graph.AddEdge(3, 4, 12);
		graph.AddEdge(4, 5, 19);
		graph.AddEdge(4, 7, 18);
		graph.AddEdge(5, 7, 21);
		graph.AddEdge(5, 6, 23);

		PrimMethod();

		for (Edge edge : mst) {
			System.out.println(edge.start + " - " + edge.end + " cost : " + edge.cost);
		}
		
	}

	public static void PrimMethod() {
		PriorityQueue<Edge> pq = new PriorityQueue<>(); // ����ġ�� ���� ����� ������ ������
		Queue<Integer> q = new LinkedList<>(); // ���� �湮 ������ ó���� ���� ť
		q.add(1); // ���� ������ 1�� ����

		while (!q.isEmpty()) {
			int start = q.poll();
			visited[start] = true;

			for (Edge edge : graph.edge[start]) { // ���� ���� start�� ����� ������
				if (!visited[edge.end]) { // ���� ���� end�� �湮���� �ʾҴٸ�
					pq.add(edge); // �켱���� ť�� ������ �߰��Ѵ�.
				}
			}

			while (!pq.isEmpty()) {
				Edge edge = pq.poll(); // ����ġ�� ���� ���� ������ ���� ���̸�
				if (!visited[edge.end]) { // ������ ����� ���� end�� �湮�� ���� ���ٸ�
					q.add(edge.end); // ť�� �ְ� ������ �湮�Ѵ�.
					visited[edge.end] = true; // �湮�߶� ������ �ٽ� �湮���� �ʵ��� ǥ��
					mst.add(edge); // �ּ� ���д� Ʈ���� �����ϴ� ���� �߰�
					
					min += edge.cost; // ����ġ �ּ� ���� �ϳ��� ����
					break; // break �ϴ� ������ 1�� ����� ���� �� �ּ� ������ ���ϰ�
				} // ������ ������ ������ �ʱ� ���ؼ� Ż�� �ϴ� ����
			}
		}

	}
}

class Graph {
	List<Edge>[] edge;

	public Graph(int V) {
		edge = new LinkedList[V + 1];
		for (int i = 1; i <= V; ++i) {
			edge[i] = new LinkedList<>();
		}
	}

	// ����� �׷���
	public void AddEdge(int start, int end, int cost) {
		edge[start].add(new Edge(start, end, cost));
		edge[end].add(new Edge(end, start, cost));
	}
}

class Edge implements Comparable<Edge> {
	int start, end, cost;

	public Edge(int start, int end, int cost) {
		this.start = start;
		this.end = end;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}