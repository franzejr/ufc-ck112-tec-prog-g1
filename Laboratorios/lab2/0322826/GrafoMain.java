public class GrafoMain {/* Classe Main do projeto */
	public static Grafo criarGrafo() {/* Este método tem função de criar um grafo. */
		Grafo grafo = new Grafo();/* Aqui um grafo é criado */
		/*
		 * Aqui são criados nós e em seguida adcionados a lista de nós do grafo
		 * criado
		 */
		grafo.addNo(new No("n1"));
		grafo.addNo(new No("n2"));
		grafo.addNo(new No("n3"));
		grafo.addNo(new No("n4"));
		grafo.addNo(new No("n5"));

		/*
		 * Aqui as arestas são criadas e seus parâmetros para o método
		 * construtor são passados. Os vértices que compõe cada aresta são
		 * retiradas diretamente da lista de aresta do grafo.
		 */
		Aresta a1 = new Aresta("a1", grafo.getNos().get(0), grafo.getNos().get(4), 1);
		Aresta a2 = new Aresta("a2",grafo.getNos().get(0), grafo.getNos().get(2), 2);
		Aresta a3 = new Aresta("a3",grafo.getNos().get(1), grafo.getNos().get(3), 4);
		Aresta a4 = new Aresta("a4",grafo.getNos().get(1), grafo.getNos().get(4), 4);
		Aresta a5 = new Aresta("a5",grafo.getNos().get(2), grafo.getNos().get(3), 3);
		Aresta a6 = new Aresta("a6",grafo.getNos().get(3), grafo.getNos().get(4), 1);

		/* As arestas são adcionadas a lista de arestas do grafo. */
		grafo.addAresta(a1);
		grafo.addAresta(a2);
		grafo.addAresta(a3);
		grafo.addAresta(a4);
		grafo.addAresta(a5);
		grafo.addAresta(a6);

		return grafo;/* O grafo criado é retornado */

	}

	public static void main(String[] args) {

		Grafo grafo = criarGrafo();/*
									 * a função criadora do grafo é chamada e
									 * atribuída a um novo grafo criado no
									 * método main.
									 */

		int i = 0, j = 0;
		/*
		 * Os dois laços for a seguir são usados para percorrer a lista de nós
		 * presente no grafo e comparar se grafo solicitado pelos parâmetros
		 * passados na chamada do programa são aqueles.
		 */
		for (i = 0; i < grafo.getNos().size(); i++) {
			if (grafo.getNos().get(i).getDescricao().equals(args[0])) {
				break;
			}
		}

		for (j = 0; j < grafo.getNos().size(); j++) {
			if (grafo.getNos().get(j).getDescricao().equals(args[1])) {
				break;
			}
		}

		/*
		 * Chama a função para encontrar o menor caminho entre dois nós de um
		 * grafo, passando como parâmetro um grafo e os dois nós.
		 */
		 Grafo gMenorCaminho = grafo.menorCaminho(grafo,
		 grafo.getNos().get(i),
		 grafo.getNos().get(j));

		/*
		 * Imprime a sequência de nós que devem ser seguidos para se ter o menor
		 * caminho.
		 */
		System.out.println("O menor caminho entre "
				+ grafo.getNos().get(i).getDescricao() + " e "
				+ grafo.getNos().get(j).getDescricao() + " é: ");
		for (int k = 0; k < gMenorCaminho.getNos().size(); k++) {
			 System.out.println(gMenorCaminho.getNos().get(k).getDescricao());
			 }

//		System.out.println("["
//				+ grafo.getArestas().get(0).getN1().getDescricao() + "]-a1-["
//				+ grafo.getArestas().get(0).getN2().getDescricao() + "]");
//		System.out.println("["
//				+ grafo.getArestas().get(1).getN1().getDescricao() + "]-a2-["
//				+ grafo.getArestas().get(1).getN2().getDescricao() + "]");
//		System.out.println("["
//				+ grafo.getArestas().get(2).getN1().getDescricao() + "]-a3-["
//				+ grafo.getArestas().get(2).getN2().getDescricao() + "]");
//		System.out.println("["
//				+ grafo.getArestas().get(3).getN1().getDescricao() + "]-a4-["
//				+ grafo.getArestas().get(3).getN2().getDescricao() + "]");
//		System.out.println("["
//				+ grafo.getArestas().get(4).getN1().getDescricao() + "]-a5-["
//				+ grafo.getArestas().get(4).getN2().getDescricao() + "]");
//		System.out.println("["
//				+ grafo.getArestas().get(5).getN1().getDescricao() + "]-a6-["
//				+ grafo.getArestas().get(5).getN2().getDescricao() + "]");

	}
}
