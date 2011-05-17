package estrutura;

import estrutura.Aresta;

public class Aresta implements Comparable<Aresta> {
	
	private static int count;
	private int myId;
	private String cor = "branco";
	private int peso;
	private Vertice v1;
	private Vertice v2;
	
	public Aresta(Vertice v1, Vertice v2, int peso){
		this.myId = count++;
		this.v1 = v1;
		this.v2 = v2;
		this.peso = peso;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Aresta.count = count;
	}

	public int getMyId() {
		return myId;
	}

	public void setMyId(int myId) {
		this.myId = myId;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Vertice getV1() {
		return v1;
	}

	public void setV1(Vertice v1) {
		this.v1 = v1;
	}

	public Vertice getV2() {
		return v2;
	}

	public void setV2(Vertice v2) {
		this.v2 = v2;
	}
	
	@Override
	public String toString() {
		String s = "";
		s+="V"+this.v1.getMyId()+"-"+this.getPeso()+"->V"+this.v2.getMyId()+" ";
		return s;
	}

	/*
	 * Sobrescrevendo o metodo compareTo da interface Comparable,
	 * a fim de que possa comparar as arestas e ordena-las
	 */
	@Override
	public int compareTo(Aresta aresta) {
		if(this.peso < aresta.getPeso()) return -1;
		else if(this.peso == aresta.getPeso()) return 0;
		
		return 1;
	}
	

}
