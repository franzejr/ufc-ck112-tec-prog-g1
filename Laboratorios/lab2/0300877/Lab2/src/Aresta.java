import java.util.ArrayList;
import java.util.List;


public class Aresta {
	
	private int peso;
	private List<Vertice> extremidades = new ArrayList<Vertice>();
	
	
	public Aresta(Vertice v1, Vertice v2){
		
		this.peso = 1;
		this.extremidades.add(v1);
		this.extremidades.add(v2);
		
	}
	
	public void setPeso(int novoPeso){
		
		this.peso = novoPeso;
	}
	
	public int getPeso(){
		
		return peso;
	}
	
	public List<Vertice> getVertices(){
		
		return extremidades;
		
	}
	
}

