import java.util.ArrayList;

/* Universidade Federal do Ceará
 * Aluno: Francisco José Lins Magalhães - 0322836
 * Laboratório 1 - Família
 */

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;

	private ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();
	private Pessoa conjuge;
	private Pessoa mae;
	private Pessoa pai;
	private ArrayList<Pessoa> irmaos = new ArrayList<Pessoa>();

	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;

	}

	public Pessoa(){
		
	}
	
	//Adicionando irmao, como ser irmao e reciproco tambem coloca a volta
	public void addIrmao(Pessoa p1){
		this.irmaos.add(p1);
		p1.getIrmao().add(this);
		
	}
	
	//Registrando os filhos Nesse caso já coloca quem eh o pai tambem para nao ter o dobro do trabalho
	public void addFilho(Pessoa p1){
		if(this.getSexo() == 'M'){
			p1.pai = this;
			this.filhos.add(p1);
		}
		else{
			p1.mae = this;
			this.filhos.add(p1);
		}
	}
	// getters e setters dos atributos que nao sao do tipo pessoa
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// getters e setters dos atributos que sao do tipo pessoa
	public ArrayList<Pessoa> getFilho() {
		return filhos;
	}

	public void setFilho(ArrayList<Pessoa> filhos) {
		this.filhos = filhos;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}

	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public ArrayList<Pessoa> getIrmao() {
		return irmaos;
	}

	public void setIrmao(ArrayList<Pessoa> irmaos) {
		this.irmaos = irmaos;
	}

	// Implementacao do que nao esta nos atributos

	public void setPais(Pessoa pai, Pessoa mae) {
		this.pai = pai;
		this.mae = mae;
	}

	public ArrayList<Pessoa> qualTio() {

		ArrayList<Pessoa> tios = new ArrayList<Pessoa>();
		ArrayList<Pessoa> tiosPai = new ArrayList<Pessoa>();
		ArrayList<Pessoa> tiosMae = new ArrayList<Pessoa>();
		Pessoa x = this.pai;
		Pessoa y = this.mae;

		tiosPai = x.getIrmao();
		tiosMae = y.getIrmao();
		
		//Adicionando os tios por parte de pai e mãe
			tios.addAll(tiosPai);
			tios.addAll(tiosMae);
			
		

		return tios;

	}

	public Pessoa qualAvo() {

		Pessoa avo = this.pai.getPai();

		return avo;

	}

	public ArrayList<Pessoa> qualPrimo() {
		ArrayList<Pessoa> primos = new ArrayList<Pessoa>();
		ArrayList<Pessoa> tios = new ArrayList<Pessoa>();

		Pessoa pai = this.pai;

		tios = pai.getIrmao();

		for (Pessoa p : tios) {

			for (Pessoa f : p.getFilho()) {
				primos.add(f);
			}
		}
		return primos;
	}

	public ArrayList<Pessoa> qualNeto() {

		ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();
		ArrayList<Pessoa> netos = new ArrayList<Pessoa>();

		filhos = this.getFilho();

		for (Pessoa p : filhos) {
			for (Pessoa f : p.getFilho()) {
				netos.add(f);
			}
		}

		return netos;
	}

	public void casar(Pessoa pessoaconjuge) {

		if (this.conjuge != null && pessoaconjuge.conjuge != null) {

			if (this.idade >= 18 && pessoaconjuge.idade >= 18) {

				if (this.sexo != pessoaconjuge.sexo) {
					System.out.println("Estas pessoas podem casar!");

					this.conjuge = pessoaconjuge;
					pessoaconjuge.conjuge = this.conjuge;
				} else
					System.out.println("Elas sao do mesmo sexo!");

			} else
				System.out.println("Uma delas possuem idade < 18 anos");

		} else
			System.out.println("Essa Pessoa ja esta casada!!");

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}

}
