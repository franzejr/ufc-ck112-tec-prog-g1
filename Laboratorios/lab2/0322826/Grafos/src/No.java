import java.util.ArrayList;

public class No {/*
				 * O n�, ou v�rtice, possui uma string pra definir seu nome, um
				 * int para a dist�ncia (que deveria facilitar no calculo da
				 * menor dist�ncia) e uma lista de arestas que s�o as arestas
				 * que est�o ligadas a um determinado n�.
				 */
	private String descricao;
	private int distancia;
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	public No(String descricao) {/*
								 * O m�todo construtor que necessita apenas do
								 * nome do n�
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
