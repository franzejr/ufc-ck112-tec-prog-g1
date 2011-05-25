
public abstract class Graph {
	
	public MySet<Vertex> vertexes = new MySet<Vertex>();
	public MySet<Edge> edges = new MySet<Edge>();

	public abstract void addVertex();
	
	public abstract void addEdge();
	
	public abstract int numberOfVertex();
	
	public abstract int numberOfEdges();
	
	public abstract int averageDegree();
	
	public abstract boolean hasCycle();
	
	public abstract void setVertexes();
	
	public abstract MySet<Vertex> getVertexes();
	
	public abstract void setEdges();
	
	public abstract MySet<Edge> getEdges();

}
