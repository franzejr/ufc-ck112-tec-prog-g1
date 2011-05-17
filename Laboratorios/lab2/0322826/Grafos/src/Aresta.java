public class Aresta { /* A classe aresta possui essas informações: */
	private String nome;
	private No n1; /* Como cada aresta só se liga 2 nós então temos */
	private No n2; /* no1 e no2 */
	private int peso; /* e seu peso */

	public Aresta(String nome, No n1, No n2, int peso) { /*
														 * O método construtor
														 * da aresta
														 */
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.peso = peso;
		n1.setArestas(this);/* atenção especial para este ponto: */
		n2.setArestas(this);/*
							 * Como as arestas estão ligadas a 2 nós e os nós
							 * estão ligados por arestas, resolvi usar esta
							 * função para já passara também essa aresta a lista
							 * de arestas destes nós.F
							 */
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public No getN1() {
		return n1;
	}

	public void setN1(No n1) {
		this.n1 = n1;
	}

	public No getN2() {
		return n2;
	}

	public void setN2(No n2) {
		this.n2 = n2;
	}

}
