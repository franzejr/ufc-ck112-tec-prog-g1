import java.util.ArrayList;
import java.util.List;


public class Aresta {
	
	private int peso;
	private Vertice[] vertices = new Vertice[2];
	
	
	public Aresta(Vertice v1, Vertice v2){
		
		this.peso = 1;
		this.vertices[0] = v1;
		this.vertices[1] = v2;
		
	}
	
	public void setPeso(int novoPeso){
		
		this.peso = novoPeso;
	}
	
	public int getPeso(){
		
		return peso;
	}
	
	public Vertice[] getVertices(){
		
		return vertices;
		
	}
	
}

