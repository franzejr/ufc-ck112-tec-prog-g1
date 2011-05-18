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
	int verticesNaoVisitados = this.vertices.size();

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
	
	public void ordenarLista(List<Vertice> lista){
		
		for (int i=lista.size()-2;i>=0;i--){
			
			for (int j=0;j<i;j++){
				
				if (lista.get(j).getDistancia() > lista.get(j+1).getDistancia()){
					
					Collections.swap(lista, j, j+1);
				}
			}
		}
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
		
		atual = v1;
		fronteira.add(atual);
		menorCaminho.add(atual);
		
		
		for (int i=0;i< this.vertices.size();i++){
			
			//Ajustando as distâncias
			if (this.vertices.get(i).equals(v1)){
				
				this.vertices.get(i).setDistancia(0);
			} else{
				
				this.vertices.get(i).setDistancia(9999);
				
			}
			
		}
		
		while (verticesNaoVisitados != 0){
			
			atual = fronteira.get(0);
			
			for (int i=0; i<atual.getArestas().size();i++){
				
				//Localizando o vértice vizinho
				if (atual.getArestas().get(i).getVertices().get(0).equals(atual)){
					
					vizinho = atual.getArestas().get(i).getVertices().get(1);
				} else {
					
					vizinho = atual.getArestas().get(i).getVertices().get(0);
				}
				
				vizinho.setPai(atual);
				
				//Comparando a distância do vizinho com a possível distância
				if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestas().get(i).getPeso())){
					
					vizinho.setDistancia(atual.getDistancia() + atual.getArestas().get(i).getPeso());
					/*Se o vizinho é o vértice procurado, e foi feita uma mudança na distância,
					 * cria a lista com o menor caminho*/
					if (vizinho.equals(v2)){
						menorCaminho.clear();
						verticeCaminho = vizinho;
						while (!verticeCaminho.equals(atual)){
							
							menorCaminho.add(verticeCaminho);
							verticeCaminho = verticeCaminho.getPai();
							
						}
						this.ordenarLista(menorCaminho);
					}
				}
				fronteira.add(vizinho);
				
			}
			
			atual.visitar();
			verticesNaoVisitados--;
			fronteira.remove(atual);
			this.ordenarLista(fronteira);
		
		}
				
		return menorCaminho;
	}

}

