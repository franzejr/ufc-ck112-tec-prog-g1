import java.util.ArrayList;

public class Grafo {/*
					 * A classe grafo possui duas listas: uma do tipo aresta e
					 * outra do tipo nó.
					 */
	ArrayList<Aresta> arestas = new ArrayList<Aresta>();
	ArrayList<No> nos = new ArrayList<No>();

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(ArrayList<Aresta> arestas) {
		this.arestas = arestas;
	}

	public ArrayList<No> getNos() {
		return nos;
	}

	public void setNos(ArrayList<No> nos) {
		this.nos = nos;
	}

	/* Este método adiciona um novo nó a lista de nós do grafo. */
	public void addNo(No n) {
		this.nos.add(n);
	}

	public void addAresta(Aresta a) {/* Semelhante ao addNo, porém para arestas. */
		this.arestas.add(a);
	}

	/* Função para encontrar o menor caminho entre dois nós dentro de um grafo. */

	public Grafo menorCaminho(Grafo grafo, No no1, No no2) {
		/*
		 * Grafo auxiliar com intuito de ser usado como retorno da função
		 */
		Grafo menor = new Grafo();
		Aresta aresta = new Aresta("a", no1, no2, 0);
		for (int i = 0; i < grafo.getNos().size(); i++) {
			grafo.getNos().get(i).setDistancia(0);
		}
		int j = 0, i = 0;
		/* Este while deve percorrer todos os nós do grafo. */
		while (grafo.getNos().get(j).getDescricao() != no2.getDescricao()) {
			/* Este while deve percorrer todas as arestas de cada nó. */
			while (i < grafo.getNos().size()) {
				/* Este if fica com a aresta de menor peso. */
				if (grafo.getArestas().get(i).getPeso() < grafo.getArestas()
						.get(i).getPeso()) {
					aresta = grafo.getArestas().get(i);
				}
				i++;
			}
			/* A aresta de menor peso é adcionada ao grafo. */
			menor.addAresta(aresta);
			menor.addNo(aresta.getN1());
			menor.addNo(aresta.getN2());
			j++;
		}
		return menor;/* o grafo auxiliar é retornado. */
	}
}
