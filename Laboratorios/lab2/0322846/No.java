package aula.grafo;

import java.util.ArrayList;

public class No {
	
	private ArrayList<Aresta> arestasEntrada = new ArrayList<Aresta>();
	private ArrayList<Aresta> arestasSaida = new ArrayList<Aresta>();
	private String descricao;
	private boolean visited=false;
	private int distance = Integer.MAX_VALUE;
	
	public ArrayList<No> getVizinhos(){
		ArrayList<No> ret = new ArrayList<No>();
		for(Aresta a : arestasSaida){
			ret.add(a.getNoDestino());
		}
		return ret;
	}
	
	public int distanciaEntre(No noVizinho){
		for(Aresta a : arestasSaida){
			if(a.getNoDestino().equals(noVizinho)){
				return a.getPeso();
			}
		}
		return -1;
	}
	
	
	public Aresta criarArestaPara(No noDestino,int peso){
		return new Aresta(this,noDestino,peso);
	}
	
	public void addArestasEntrada(Aresta aresta){
		arestasEntrada.add(aresta);
	}
	
	public void addArestasSaida(Aresta aresta){
		arestasSaida.add(aresta);
	}	
	
	public ArrayList<Aresta> getArestasEntrada() {
		return arestasEntrada;
	}
	
	public void setArestasEntrada(ArrayList<Aresta> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}
	
	public ArrayList<Aresta> getArestasSaida() {
		return arestasSaida;
	}
	
	public void setArestasSaida(ArrayList<Aresta> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
	
		
	
}
