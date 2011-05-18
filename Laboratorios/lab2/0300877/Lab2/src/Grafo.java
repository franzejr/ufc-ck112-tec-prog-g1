import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Grafo {

	private List<Vertice> vertices = new ArrayList<Vertice>();
	private List<Aresta> arestas = new ArrayList<Aresta>();
	
	//Atributos usados na função encontrarMenorCaminho
	
	//Lista que guarda os vértices pertencentes ao menor caminho encontrado
	List<Vertice> menorCaminho = new ArrayList<Vertice>();
	
	//Variável que recebe os vértices pertencentes ao menor caminho
	Vertice verticeCaminho = new Vertice ("caminho");
	
	//Variável que guarda o vértice que está sendo visitado 
	Vertice atual = new Vertice ("atual");
	
	//Variável que marca o vizinho do vértice atualmente visitado 
	Vertice vizinho = new Vertice ("vizinho");
	
	//Corte de vértices que já tiveram suas distâncias marcadas e cujos vizinhos não foram visitados
	List<Vertice> fronteira = new ArrayList<Vertice>();
	
	//Guarda o número de vértices não visitados
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
	
	//Método que retorna o vértice cuja descrição é igual à procurada.
	public Vertice encontrarVertice(String nome){
		
		for (int i=0;i<this.getVertices().size();i++){
			
			if (nome.equalsIgnoreCase(this.getVertices().get(i).getDescricao())){
				
				return this.getVertices().get(i);
				
			}
		}
		
		return null;
		
	}
	
	//Algoritmo de Dijkstra
	public List<Vertice> encontrarMenorCaminhoDijkstra(Vertice v1, Vertice v2){
		
		//No início, todos os vértices do grafo não foram visitados
		verticesNaoVisitados = this.getVertices().size();
		
		//O primeiro nó a ser visitado é o da origem do caminho
		atual = v1;
		//Adiciona o primeiro nó no corte
		fronteira.add(atual);
		//Adiciona a origem na lista do menor caminho
		menorCaminho.add(atual);
		
		//Colocando a distancias iniciais
		for (int i=0;i< this.vertices.size();i++){
			
			//Nó atual tem distância zero, e todos os outros, 9999(infinita)
			if (this.vertices.get(i).getDescricao().equals(atual.getDescricao())){
				
				this.vertices.get(i).setDistancia(0);
				
			} else{
				
				this.vertices.get(i).setDistancia(9999);
				
			}
		}
		
		//O algoritmo continua até que todos os vértices sejam visitados
		while (verticesNaoVisitados != 0){
			
			//Toma-se sempre o vértice com menor distância, que é o primeiro da lista do corte
			atual = this.fronteira.get(0);
			/*Para cada vizinho (cada aresta), calcula-se a sua possível distância,
			somando a distância do vértice atual com a da aresta correspondente.
			Se essa distância for menor que a distância do vizinho, esta é atualizada.
			*/ 
			for (int i=0; i<atual.getArestas().size();i++){
				
				vizinho = atual.getArestas().get(i).getDestino();				
				if (!vizinho.verificarVisita()){
					
					vizinho.setPai(atual);
					
					//Comparando a distância do vizinho com a possível distância
					if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestas().get(i).getPeso())){
						
						vizinho.setDistancia(atual.getDistancia() + atual.getArestas().get(i).getPeso());
						
						/*Se o vizinho é o vértice procurado, e foi feita uma mudança na distância,
						 * a lista com o menor caminho anterior é apagada, pois existe um caminho menor ainda.
						 * Cria-se a nova lista do menor caminho, com os vértices pais, até o vértice origem.
						 * */
						if (vizinho == v2){
							menorCaminho.clear();
							verticeCaminho = vizinho;
							menorCaminho.add(vizinho);
							while (verticeCaminho.getPai() != null){
							
								menorCaminho.add(verticeCaminho.getPai());
								verticeCaminho = verticeCaminho.getPai();
								
								
							}
							//Ordena a lista do menor caminho, para que ele seja exibido da origem ao destino.
							Collections.sort(menorCaminho);
							
						}
					}
					//Cada vizinho, depois de visitado, é adicionado ao corte
					this.fronteira.add(vizinho);
				}
				
			}
			//Marca o vértice atual como visitado e o retira do corte
			atual.visitar();
			verticesNaoVisitados--;
			this.fronteira.remove(atual);
			/*Ordena a lista do corte, para que o vértice com menor distância fique na primeira
			 * posição*/
			
			Collections.sort(fronteira);
		
		}
				
		return menorCaminho;
	}
	

}

