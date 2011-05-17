import java.util.List;

public class Vertice {
	
	private String descricao;
	private List<Vertice> vizinhos;
	
	public Vertice(String nome){
		
		this.descricao = nome;
		
	}
	
	public String getDescricao(){
		
		return descricao;
		
	}
	
	public void setVizinho(List<Vertice> vizinhos){
		
		this.vizinhos = vizinhos;
						
	}
	
	public List<Vertice> getVizinhos(){
		
		return vizinhos;
		
	}
	
}

