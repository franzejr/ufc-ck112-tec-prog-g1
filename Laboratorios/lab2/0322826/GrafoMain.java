public class GrafoMain {/* Classe Main do projeto */
	public static Grafo criarGrafo() {/* Este m�todo tem fun��o de criar um grafo. */
		Grafo grafo = new Grafo();/* Aqui um grafo � criado */
		/*
		 * Aqui s�o criados n�s e em seguida adcionados a lista de n�s do grafo
		 * criado
		 */
		grafo.addNo(new No("n1"));
		grafo.addNo(new No("n2"));
		grafo.addNo(new No("n3"));
		grafo.addNo(new No("n4"));
		grafo.addNo(new No("n5"));

		/*
		 * Aqui as arestas s�o criadas e seus par�metros para o m�todo
		 * construtor s�o passados. Os v�rtices que comp�e cada aresta s�o
		 * retiradas diretamente da lista de aresta do grafo.
		 */
		Aresta a1 = new Aresta("a1", grafo.getNos().get(0), grafo.getNos().get(4), 1);
		Aresta a2 = new Aresta("a2",grafo.getNos().get(0), grafo.getNos().get(2), 2);
		Aresta a3 = new Aresta("a3",grafo.getNos().get(1), grafo.getNos().get(3), 4);
		Aresta a4 = new Aresta("a4",grafo.getNos().get(1), grafo.getNos().get(4), 4);
		Aresta a5 = new Aresta("a5",grafo.getNos().get(2), grafo.getNos().get(3), 3);
		Aresta a6 = new Aresta("a6",grafo.getNos().get(3), grafo.getNos().get(4), 1);

		/* As arestas s�o adcionadas a lista de arestas do grafo. */
		grafo.addAresta(a1);
		grafo.addAresta(a2);
		grafo.addAresta(a3);
		grafo.addAresta(a4);
		grafo.addAresta(a5);
		grafo.addAresta(a6);

		return grafo;/* O grafo criado � retornado */

	}

	public static void main(String[] args) {

		Grafo grafo = criarGrafo();/*
									 * a fun��o criadora do grafo � chamada e
									 * atribu�da a um novo grafo criado no
									 * m�todo main.
									 */

		int i = 0, j = 0;
		/*
		 * Os dois la�os for a seguir s�o usados para percorrer a lista de n�s
		 * presente no grafo e comparar se grafo solicitado pelos par�metros
		 * passados na chamada do programa s�o aqueles.
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
		 * Chama a fun��o para encontrar o menor caminho entre dois n�s de um
		 * grafo, passando como par�metro um grafo e os dois n�s.
		 */
		 Grafo gMenorCaminho = grafo.menorCaminho(grafo,
		 grafo.getNos().get(i),
		 grafo.getNos().get(j));

		/*
		 * Imprime a sequ�ncia de n�s que devem ser seguidos para se ter o menor
		 * caminho.
		 */
		System.out.println("O menor caminho entre "
				+ grafo.getNos().get(i).getDescricao() + " e "
				+ grafo.getNos().get(j).getDescricao() + " �: ");
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
