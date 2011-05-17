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
	
	public Grafo encontrarMenorCaminho(Vertice v1, Vertice v2){
		
		Grafo menorCaminho = new Grafo();
		Vertice atual = new Vertice("atual");
		int verticesNaoVisitados = this.vertices.size();
		
		
		for (int i=0;i<this.vertices.size();i++){
			
			if (vertices.get(i).equals(v1)){
				
				vertices.get(i).setDistancia(0);
				vertices.get(i).visitar();
				verticesNaoVisitados = verticesNaoVisitados - 1;
				menorCaminho.vertices.add(v1);
				
			} else {
				
				vertices.get(i).setDistancia(1000);
			} 
			
		}
		atual = v1;
		while (verticesNaoVisitados != 0){
			
			for (int i=0;i<atual.getVizinhos().size();i++){
				
				if (atual.getVizinhos().get(i).verificarVisita() == false){
					
					
				}
				
			}
		}
		
		
		return menorCaminho;
		
	}

}

