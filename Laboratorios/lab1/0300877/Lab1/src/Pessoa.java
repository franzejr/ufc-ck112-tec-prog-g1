import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
	private int idade;
	private char sexo;

	private Pessoa mae;
	private Pessoa pai;
	private Pessoa conjuge;
	private List<Pessoa> filhos = new ArrayList<Pessoa>();

	public Pessoa(String nome, int idade, char sexo){
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
	public void casar(Pessoa conjuge){
		if ((this.idade >=18) && (conjuge.getIdade() >= 18)){
			
			this.conjuge = conjuge;
			conjuge.conjuge = this;
			
		}
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public int getIdade(){
		return idade;
	}

	public void setSexo(char sexo){
		this.sexo = sexo;
	}

	public char getSexo(){
		return sexo;
	}

	public void setConjuge(Pessoa conjuge){
		this.conjuge = conjuge;
	}
	public Pessoa getConjuge(){
		return this.conjuge;

	}
    
    public void setFilho(Pessoa filho){
    	this.filhos.add(filho);

    }

    public List<Pessoa> getFilhos(){
    	return filhos;
	}
        
	public void setPai(Pessoa pai){
		this.pai = pai;
		this.pai.setFilho(this);
	}

	public void setMae(Pessoa mae){
		this.mae = mae;
		this.mae.setFilho(this);
	}

	public Pessoa getPai (){
		return this.pai;
	}
	
	public Pessoa getMae(){
		
		return this.mae;
		
	}
	public List<Pessoa> getIrmaos(){
		List<Pessoa> irmaos = new ArrayList<Pessoa>();
		for (int i=0;i<this.mae.filhos.size();i++){
			if (this.mae.filhos.get(i) != this){
				irmaos.add(this);
			}
		}
		return irmaos;
	}
	
	public List<Pessoa> getNetos(){
		List<Pessoa> netos = new ArrayList<Pessoa>();
		for (int i=0;i<this.filhos.size();i++){
			
			netos.addAll(this.filhos.get(i).filhos);
		}
		return netos;
	}

	public List<Pessoa> getTios(){
		List<Pessoa> tios = new ArrayList<Pessoa>();
		for (int i=0;i<this.pai.mae.filhos.size();i++){
			if (this.pai.mae.filhos.get(i) != this.pai){
				tios.add(this.pai.mae.filhos.get(i));
			}
		}
		for (int i=0;i<this.mae.mae.filhos.size();i++){
			if (this.mae.mae.filhos.get(i) != this.mae){
				tios.add(this.mae.mae.filhos.get(i));
			}
		}
		return tios;
	}

	public List<Pessoa> getPrimos(){
		List <Pessoa> primos = new ArrayList<Pessoa>();
		for (int i=0;i<this.pai.mae.filhos.size();i++){
			
			if (this.pai.mae.filhos.get(i) != this.pai){
				primos.addAll(this.pai.mae.filhos.get(i).filhos);
			}
			
		}

		for (int i=0;i<this.mae.mae.filhos.size();i++){
			
			if (this.mae.mae.filhos.get(i) != this.mae){
				primos.addAll(this.mae.mae.filhos.get(i).filhos);
			}
		}
		return primos;
	}

}
