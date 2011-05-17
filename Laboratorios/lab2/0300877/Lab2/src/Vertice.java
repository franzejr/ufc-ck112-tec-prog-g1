import java.util.ArrayList;
import java.util.List;

public class Vertice {
	
	private String descricao;
	private int distancia;
	private boolean visitado = false;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private List<Vertice> vizinhos = new ArrayList<Vertice>();
	
	public Vertice(String nome){
		
		this.descricao = nome;
		
	}
	
	public String getDescricao(){
		
		return descricao;
		
	}
	
	public void visitar (){
		
		this.visitado = true;
	}
	
	public boolean verificarVisita(){
		
		return visitado;
	}
	
	public void setDistancia(int distancia){
		
		this.distancia = distancia;
	}
	
	public int getDistancia(){
		
		return this.distancia;
	}


	public void setVizinhos(List<Vertice> vizinhos) {
		
		this.vizinhos.addAll(vizinhos);
		
		for (int i=0;i<vizinhos.size();i++){
			Aresta a = new Aresta(this, vizinhos.get(i));
			this.arestas.add(a);
		}
	}
	
	public List<Vertice> getVizinhos(){
		
		return this.vizinhos;
	}
	
	public List<Aresta> getArestas() {
		
		return arestas;
	}
	
}

