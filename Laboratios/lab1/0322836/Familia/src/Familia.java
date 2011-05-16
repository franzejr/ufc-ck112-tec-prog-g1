import java.util.ArrayList;

/* Universidade Federal do Ceará
 * Aluno: Francisco José Lins Magalhães - 0322836
 * Laboratório 1 - Família
 */
public class Familia {

	static ArrayList<Pessoa> arvore = new ArrayList<Pessoa>();

	public void criarArvore() {

		Pessoa p1 = new Pessoa("João", 20, 'M');
		Pessoa p2 = new Pessoa("Maria", 18, 'F');
		Pessoa p3 = new Pessoa("Antonio", 3, 'M');
		Pessoa p4 = new Pessoa("Julia", 3, 'M');
		Pessoa p5 = new Pessoa("Mariana", 3, 'M');
		p1.casar(p2);
		p3.setPai(p1);
		p3.setMae(p2);
		p3.addIrmao(p4);
		p4.setPai(p1);
		p4.setMae(p2);
		p5.setPai(p1);
		p5.setMae(p2);

		arvore.add(p1);
		arvore.add(p2);
		arvore.add(p3);
		arvore.add(p4);
		arvore.add(p5);

	}

	public static Pessoa buscarNaArvore(String nome) {

		for (Pessoa p : arvore) {
			if (p.getNome().equals(nome)) 	return p;
		}

		return null;
	}
	
	/*
	 * A funçao main irá funcionar quando forem passados por parametros, exemplo pai Antonio assim como diz na ultima questao
	 */

	public static void main(String args[]) {

		Familia familia = new Familia();
		familia.criarArvore();

		// Querendo saber quem eh o pai da pessoa
		if ("pai".equalsIgnoreCase(args[0])) {

			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {
				System.out.println("A pessoa esta na arvore");

				System.out.println("O Pai dele eh: "+buscada.getPai().getNome());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem eh a mae da pessoa
		if ("mae".equalsIgnoreCase(args[0])) {

			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

				System.out.println("A mãe dele eh: "+buscada.getMae().getNome());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem sao os filhos da pessoa
		if ("filho".equalsIgnoreCase(args[0])) {

			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

				System.out.println(buscada.getFilho());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem sao os irmaos da pessoa
		if ("irmao".equalsIgnoreCase(args[0])) {

			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

					
						System.out.println(buscada.getIrmao());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem sao os netos da pessoa
		if ("neto".equalsIgnoreCase(args[0])
				|| "netos".equalsIgnoreCase(args[0])) {
			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

				System.out.println(buscada.qualNeto());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem sao os tios da pessoa
		if ("tio".equalsIgnoreCase(args[0]) || "tios".equalsIgnoreCase(args[0])) {
			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

				System.out.println(buscada.qualTio());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

		// Querendo saber quem sao os primos da pessoa
		if ("primo".equalsIgnoreCase(args[0])
				|| "primos".equalsIgnoreCase(args[0])) {

			String nome = args[1];

			Pessoa buscada = buscarNaArvore(nome);

			if (buscada != null) {

				System.out.println(buscada.qualPrimo());

			} else
				System.out.println("A pessoa não está na árvore!");

		}

	}
}
