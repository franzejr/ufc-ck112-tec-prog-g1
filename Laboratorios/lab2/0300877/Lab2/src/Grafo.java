import java.util.List;

public class Grafo {

	private List<Vertice> vertices;
	private List<Aresta> arestas;

	public void setArestas(List<Aresta> arestas) {

		this.arestas = arestas;

	}

	public List<Aresta> getArestas() {

		return arestas;

	}

	public void setVertices(List<Vertice> vertices) {
		
		this.vertices = vertices;
	}

	public List<Vertice> getVertices() {
		
		return vertices;
	}

}

