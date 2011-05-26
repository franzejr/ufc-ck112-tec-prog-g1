package aula.Familia;

import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	private Pessoa pai;	
	private Pessoa mae;
	private Pessoa conjuge = null;
	private ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();
	
	
	public Pessoa(String nome, int idade, char sexo) {		
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
		
	
	
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	public Pessoa getPai() {
		return pai;
	}
	
	public Pessoa getMae() {
		return mae;
	}
	
	public ArrayList<Pessoa> getFilhos(){
		return filhos;
	}	
	
	public ArrayList<Pessoa> getIrmaos(){
		ArrayList<Pessoa> irmaos = new ArrayList<Pessoa>();
		irmaos.addAll(pai.getFilhos());
		irmaos.addAll(mae.getFilhos());
		return irmaos;
	}
	
	public ArrayList<Pessoa> getNetos(){
		ArrayList<Pessoa> netos = new ArrayList<Pessoa>();
		for(Pessoa p : pai.getFilhos()){
			netos.addAll(p.getFilhos());
		}
		for(Pessoa m : mae.getFilhos()){
			netos.addAll(m.getFilhos());
		}
		
		return netos;
	}
	
	public ArrayList<Pessoa> getTios(){
		ArrayList<Pessoa> tios = new ArrayList<Pessoa>();
		tios.addAll(pai.getIrmaos());
		tios.addAll(mae.getIrmaos());		
		return tios;
		
	}
	
	public ArrayList<Pessoa> getPrimos(){
		ArrayList<Pessoa> primos = new ArrayList<Pessoa>();
		for(Pessoa p : this.getTios()){
			primos.addAll(p.getFilhos());
		}
		return primos;
	}
	
	
	public void casarCom(Pessoa conjuge){
		if(this.conjuge==null && conjuge.getSexo()!=this.getSexo()){
			if(this.idade>=18 && conjuge.idade >= 18){
				this.conjuge = conjuge;
			}
		}
	}
	
	
	
	
	
	
	
	
	

}
