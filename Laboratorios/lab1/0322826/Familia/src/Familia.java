import java.util.ArrayList;

public class Familia {
	public static void main(String[] args) {

		Pessoa a1 = new Pessoa("Mario", 50, 'M');/* avô da família */
		Pessoa a2 = new Pessoa("Josefina", 48, 'F');/* avó da família */
		Pessoa t1 = new Pessoa("José", 25, 'M');/* tio 1 */
		Pessoa t2 = new Pessoa("Firmino", 28, 'M');/* tio 2 */
		Pessoa p1 = new Pessoa("João", 20, 'M');/*
												 * pai de antonio, julia e
												 * mariana
												 */
		Pessoa p2 = new Pessoa("Maria", 18, 'F');/*
												 * mae de antonio, julia e
												 * mariana
												 */
		Pessoa p3 = new Pessoa("Antonio", 3, 'M');/*
												 * filho de joao e maria e neto
												 * de mario e josefina
												 */
		Pessoa p4 = new Pessoa("Julia", 3, 'M');/*
												 * filha de joao e maria e neto
												 * de mario e josefina
												 */
		Pessoa p5 = new Pessoa("Mariana", 3, 'M');/*
												 * filha de joao e maria e neto
												 * de mario e josefina
												 */

		a1.casar(a2);
		a2.casar(a1);
		t1.setPai(a1);
		t1.setMae(a2);
		t2.setPai(a1);
		t2.setMae(a2);
		p1.setPai(a1);
		p1.setMae(a2);
		p1.casar(p2);
		p2.casar(p1);
		p3.setPai(p1);
		p3.setMae(p2);
		p4.setPai(p1);
		p4.setMae(p2);
		p5.setPai(p1);
		p5.setMae(p2);

		ArrayList<Pessoa> arvore = new ArrayList<Pessoa>();
		arvore.add(p1);
		arvore.add(p2);
		arvore.add(p3);
		arvore.add(p4);
		arvore.add(p5);
		arvore.add(a1);
		arvore.add(a2);
		arvore.add(t1);
		arvore.add(t2);

		for (Pessoa familiar : arvore) {
			if (familiar.getNome().equals(args[1])) {
				parentesco(args[0], familiar);
			}
		}

	}

	public static void parentesco(String string, Pessoa pessoa) {
		if (string.equals("pai")) {
			System.out.println(string + "(" + pessoa.getNome() + ") -> "
					+ pessoa.getPai().getNome());
		}
		if (string.equals("mae")) {
			System.out.println(string + "(" + pessoa.getNome() + ") -> "
					+ pessoa.getMae().getNome());
		}
		if (string.equals("irmao")) {
			String[] irmaos = (String[]) pessoa.getPai().getFilhos()
					.toArray(new String[0]);
			for (int i = 0; i < irmaos.length; i++) {
				if (pessoa.getNome() != irmaos[i]) {
					System.out.println(string + "(" + pessoa.getNome()
							+ ") -> " + irmaos[i]);
				}
			}
		}
		if (string.equals("tio")) {

			String[] tios = (String[]) pessoa.getPai().getPai().getFilhos()
					.toArray(new String[0]);
			for (int i = 0; i < tios.length; i++) {
				if (pessoa.getPai().getNome() != tios[i]) {
					System.out.println(string + "(" + pessoa.getNome()
							+ ") -> " + tios[i]);
				}
			}
		}
	}

}
