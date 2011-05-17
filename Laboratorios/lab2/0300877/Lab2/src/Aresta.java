import java.util.List;


public class Aresta {
	
	private int peso;
	private List<Vertice> vertices = null;
	
	public Aresta(){
		
		this.peso = 1;
				
	}
	
	public void setPeso(int novoPeso){
		
		this.peso = novoPeso;
	}
	
	public int getPeso(){
		
		return peso;
	}
	
	public void setVertices(List<Vertice> vertices){
		
		this.vertices = vertices;
		
	}
	
	public List<Vertice> getVertices(){
		
		return vertices;
		
	}
	
}

