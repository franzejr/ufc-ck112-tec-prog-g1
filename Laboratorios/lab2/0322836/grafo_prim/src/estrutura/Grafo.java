package estrutura;

import java.util.Collections;

import estrutura.Vertice;

public class Grafo {
	
	private MySet<Vertice> vertices = new MySet<Vertice>();
	private MySet<Aresta> arestas = new MySet<Aresta>();
	
	public Grafo(){ }

	public void setArestas(MySet<Aresta> arestas) {
		this.arestas = arestas;
	}

	public MySet<Aresta> getArestas() {
		return arestas;
	}

	public void setVertices(MySet<Vertice> vertices) {
		this.vertices = vertices;
	}

	public MySet<Vertice> getVertices() {
		return vertices;
	}
	
	public void addVertice(Vertice v){
		this.vertices.addElement(v);
	}
	
	//Como o grafo é n-direcionado, esse metodo ja adiciona essa aresta aos dois vertices
	public void addAresta(Aresta a){
		
		Vertice v1 = a.getV1();
		Vertice v2 = a.getV2();
		v1.addVizinho(v2, a.getPeso());
		v2.addVizinho(v1, a.getPeso());
		this.arestas.addElement(a);
	}
	
	public void ordenarArestas(){
		Collections.sort(this.arestas.getElements());
	}
	
	@Override
	public String toString() {
		String s = "";
		for(Vertice v:this.vertices.getElements())
			s+=v+"\n";
		return s;
	}
	
}
