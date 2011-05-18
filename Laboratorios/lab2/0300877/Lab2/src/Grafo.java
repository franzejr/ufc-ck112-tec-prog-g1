import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Grafo {

	private List<Vertice> vertices = new ArrayList<Vertice>();
	private List<Aresta> arestas = new ArrayList<Aresta>();
	
	//Atributos usados na função encontrarMenorCaminho
	List<Vertice> menorCaminho = new ArrayList<Vertice>();
	Vertice verticeCaminho = new Vertice ("caminho");
	Vertice atual = new Vertice ("atual");
	Vertice vizinho = new Vertice ("vizinho");
	List<Vertice> fronteira = new ArrayList<Vertice>();
	int verticesNaoVisitados;

	public void setArestas(List<Aresta> arestas){
		
		this.arestas.addAll(arestas);
	}

	public List<Aresta> getArestas() {

		return arestas;

	}

	public void setVertices(List<Vertice> vertices) {
		
		this.vertices.addAll(vertices);
	}

	public List<Vertice> getVertices() {
		
		return this.vertices;
	}
	
	public Vertice encontrarVertice(String nome){
		
		for (int i=0;i<this.getVertices().size();i++){
			
			if (nome.equalsIgnoreCase(this.getVertices().get(i).getDescricao())){
				
				return this.getVertices().get(i);
				
			}
		}
		
		return null;
		
	}
	
	public List<Vertice> encontrarMenorCaminhoDijkstra(Vertice v1, Vertice v2){
		
		verticesNaoVisitados = this.getVertices().size();
		atual = v1;
		fronteira.add(atual);
		menorCaminho.add(atual);
		
		//Colocando a distancias iniciais
		for (int i=0;i< this.vertices.size();i++){
			
			//Ajustando as distâncias
			if (this.vertices.get(i).getDescricao().equals(atual.getDescricao())){
				
				this.vertices.get(i).setDistancia(0);
				
			} else{
				
				this.vertices.get(i).setDistancia(9999);
				
			}
		}
		
		
		while (verticesNaoVisitados != 0){
			
			atual = this.fronteira.get(0);
			for (int i=0; i<atual.getArestas().size();i++){
				
				vizinho = atual.getArestas().get(i).getDestino();				
				if (!vizinho.verificarVisita()){
					
					vizinho.setPai(atual);
					
					//Comparando a distância do vizinho com a possível distância
					if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestas().get(i).getPeso())){
						
						vizinho.setDistancia(atual.getDistancia() + atual.getArestas().get(i).getPeso());
						
						/*Se o vizinho é o vértice procurado, e foi feita uma mudança na distância,
						 * cria a lista com o menor caminho*/
						if (vizinho == v2){
							menorCaminho.clear();
							verticeCaminho = vizinho;
							menorCaminho.add(vizinho);
							while (verticeCaminho.getPai() != null){
							
								menorCaminho.add(verticeCaminho.getPai());
								verticeCaminho = verticeCaminho.getPai();
								
								
							}
							//this.ordenarLista(menorCaminho);
							Collections.sort(menorCaminho);
							
						}
					}
					this.fronteira.add(vizinho);
				}
				
			}
			
			atual.visitar();
			verticesNaoVisitados--;
			this.fronteira.remove(atual);
			//this.ordenarLista(fronteira);
			Collections.sort(fronteira);
		
		}
				
		return menorCaminho;
	}
	

}

