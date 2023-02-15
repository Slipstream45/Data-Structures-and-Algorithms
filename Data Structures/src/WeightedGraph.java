import java.util.LinkedList;
public class WeightedGraph {
	
	int V;
	LinkedList<Edge> adjListArray[];
	
	static class Edge {
		int dest;
		int weight;
		
		Edge(int dest, int weight){
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	WeightedGraph(int V){
		this.V = V;
		adjListArray = new LinkedList[V];
		for(int i=0;i<V;i++) {
			adjListArray[i] = new LinkedList<Edge>();
		}
		
	}
	
	public void addEdge(int src, int dest, int weight) {
		adjListArray[src].add(new Edge(dest, weight));
		adjListArray[dest].add(new Edge(src, weight));
	}
	
	public void printGraph() {
		for(int v=0;v<V;v++) {
			System.out.println("Adjacency List of vertex : " + v);
			System.out.print("Head ");
			
			for(Edge path : adjListArray[v]) {
				System.out.print(v + " -> " + path.dest + "(" + path.weight + ") ");
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 4, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 4);
        graph.addEdge(1, 4, 6);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 4, 2);

        graph.printGraph();
    }
}
