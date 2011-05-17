import java.util.ArrayList;

public class No {/*
				 * O nó, ou vértice, possui uma string pra definir seu nome, um
				 * int para a distância (que deveria facilitar no calculo da
				 * menor distância) e uma lista de arestas que são as arestas
				 * que estão ligadas a um determinado nó.
				 */
	private String descricao;
	private int distancia;
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	public No(String descricao) {/*
								 * O método construtor que necessita apenas do
								 * nome do nó
								 */
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(Aresta arestas) {
		this.arestas.add(arestas);
	}

}
