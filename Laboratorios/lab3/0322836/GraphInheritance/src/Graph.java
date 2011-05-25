
public abstract class Graph {
	
	private MySet<Vertex> vertexes = new MySet<Vertex>();
	private MySet<Edge> edges = new MySet<Edge>();

	public abstract void addVertex();
	
	public abstract void addEdge();
	
	public abstract int numberOfVertex();
	
	public abstract int numberOfEdges();
	
	public abstract int averageDegree();
	
	public abstract boolean hasCycle();
	
	public void setVertexes(MySet<Vertex> vertexes) {
		this.vertexes = vertexes;
	}
	public MySet<Vertex> getVertexes() {
		return vertexes;
	}
	public void setEdges(MySet<Edge> edges) {
		this.edges = edges;
	}
	public MySet<Edge> getEdges() {
		return edges;
	}

}
