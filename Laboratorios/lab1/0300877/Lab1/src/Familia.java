import java.util.ArrayList;
import java.util.List;


public class Familia {

	private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public void criarArvore(){
		
		Pessoa p1 = new Pessoa("Joao", 20, 'M');
		Pessoa p2 = new Pessoa("Maria", 18, 'F');
		Pessoa p3 = new Pessoa("Antonio", 3, 'M');
		Pessoa p4 = new Pessoa("Julia", 3, 'F');
		Pessoa p5 = new Pessoa("Mariana", 3, 'F');
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		listaPessoas.add(p5);
		
		p1.casar(p2);
		p3.setPai(p1);
		p3.setMae(p2);
		p4.setPai(p1);
		p4.setMae(p2);
		p5.setPai(p1);
		p5.setMae(p2);
		
	}
	
	public Pessoa encontrarPessoa(String nome){
		
		for (int i=0;i<listaPessoas.size();i++){
			
			if (nome.equals(listaPessoas.get(i).getNome())){
				
				return listaPessoas.get(i); 
				
			}
		}
		return null;
	}
	
	public void imprimirEstrutura(String nome1, String nome2){
		
		System.out.print(nome1 + " " + nome2 + " -> ");
	}
		
	public void interpretarPedido(String parentesco, Pessoa pessoa){
				
		if ("pai".equalsIgnoreCase(parentesco)){
			
			this.imprimirEstrutura(parentesco, pessoa.getNome());
			System.out.println(pessoa.getPai().getNome());
			
		}
		if ("mae".equalsIgnoreCase(parentesco)){
			
			imprimirEstrutura(parentesco, pessoa.getNome());
			System.out.println(pessoa.getMae().getNome()); 
		}
		
		if ("filho".equalsIgnoreCase(parentesco)){
			
			for (int i=0;i<pessoa.getFilhos().size();i++){
				imprimirEstrutura(parentesco, pessoa.getNome());
				System.out.println(pessoa.getFilhos().get(i));
				
			}
		}
		if ("irmao".equalsIgnoreCase(parentesco)){
			for (int i=0;i<pessoa.getIrmaos().size();i++){
				imprimirEstrutura(parentesco, pessoa.getNome());
				System.out.println(pessoa.getIrmaos().get(i));
			}
			
		}
		if ("primo".equalsIgnoreCase(parentesco)){
			for (int i=0;i<pessoa.getPrimos().size();i++){
				imprimirEstrutura(parentesco, pessoa.getNome());
				System.out.println(pessoa.getPrimos().get(i));
				
			}
		}
		if ("neto".equalsIgnoreCase(parentesco)){
			for (int i=0;i<pessoa.getNetos().size();i++){
				imprimirEstrutura(parentesco, pessoa.getNome());
				System.out.println(pessoa.getNetos().get(i));
				
			}
			
		}
	}
	
	
    public static void main (String args[]){

        Familia familia = new Familia();

        familia.criarArvore(); 
        
        familia.interpretarPedido(args[0], familia.encontrarPessoa(args[1]));
    }
}
