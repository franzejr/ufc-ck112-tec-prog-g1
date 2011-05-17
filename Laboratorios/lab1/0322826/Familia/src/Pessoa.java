import java.util.ArrayList;


public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private boolean casado;
	private Pessoa conjuge;
	private Pessoa mae;
	private Pessoa pai;
	ArrayList<String> filhos = new ArrayList<String>();

	public Pessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

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

	public Pessoa getConjuge() {
		return conjuge;
	}

	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
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
		pai.setFilhos(this.getNome());
	}

	public ArrayList<String> getFilhos() {
		return filhos;
	}

	public void setFilhos(String filhos) {
		this.filhos.add(filhos);
	}

	
	public boolean casar(Pessoa conjuge) {
		if (this.getIdade() < 18 || conjuge.getIdade() < 18) {
			return false;
		}
		if (this.getSexo() == conjuge.getSexo()) {
			return false;
		}
		if (this.isCasado() == true || conjuge.isCasado() == true) {
			return false;
		}

		this.conjuge = conjuge;
		this.setCasado(true);
		conjuge.setCasado(true);
		return true;
	}

}
