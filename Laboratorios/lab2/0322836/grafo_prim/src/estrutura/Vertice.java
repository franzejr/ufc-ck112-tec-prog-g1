package estrutura;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

	private static int count;
	private int myId;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private List<Vertice> vizinhos = new ArrayList<Vertice>();
	private String cor;

	public Vertice(String cor) {
		this.myId = ++count;
		this.cor = cor;
	}
	
	public Vertice(){
		this.myId = ++count;
	}
	
	public void addVizinho(Vertice vizinho, int peso){
		Aresta a = new Aresta(this, vizinho, peso);
		this.vizinhos.add(vizinho);
		this.arestas.add(a);
		
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vertice.count = count;
	}

	public int getMyId() {
		return myId;
	}

	public void setMyId(int myId) {
		this.myId = myId;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

	public List<Vertice> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(List<Vertice> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		String s = " ";
		s += "V" + this.getMyId() + ": ";
		for (Aresta a : arestas) {
			s += a.toString();
		}
		s += ".";
		return s;

	}

}
