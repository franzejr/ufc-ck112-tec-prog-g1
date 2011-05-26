package aula.grafo;

public class Aresta {
	
	private int peso;
	private No noOrigem;
	private No noDestino;

	public Aresta(No noOrigem,No noDestino,int peso) {
		noOrigem.addArestasSaida(this);
		noDestino.addArestasEntrada(this);
		this.peso = peso;
	}
	
	

	public No getNoOrigem() {
		return noOrigem;
	}



	public void setNoOrigem(No noOrigem) {
		this.noOrigem = noOrigem;
	}



	public No getNoDestino() {
		return noDestino;
	}



	public void setNoDestino(No noDestino) {
		this.noDestino = noDestino;
	}



	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
	

}
