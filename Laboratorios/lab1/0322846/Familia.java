package aula.Familia;

public class Familia {
	
	private static void criarArvore() {
		Pessoa p1 = new Pessoa("João", 20, 'M');
		Pessoa p2 = new Pessoa("Maria", 18, 'F');
		Pessoa p3 = new Pessoa("Antonio",3,'M');
		Pessoa p4 = new Pessoa("Julia",3,'M');
		Pessoa p5 = new Pessoa("Mariana",3,'M');
		p1.casarCom(p2);
		p3.setPai(p1);
		p3.setMae(p2);
		p4.setPai(p1);
		p4.setMae(p2);
		p5.setPai(p1);
		p5.setMae(p2);
	}
	
	public static void main(String[] args){
		
	}
}
