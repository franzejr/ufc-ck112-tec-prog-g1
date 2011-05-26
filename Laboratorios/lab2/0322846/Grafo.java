package aula.grafo;

import java.util.ArrayList;

public class Grafo {
	
	private ArrayList<No> nos = new ArrayList<No>();
	
	
	public Grafo(ArrayList<No> nos){
		this.nos = nos;
	}
	
	public Grafo menorCaminho(No noPartida,No noChegada){
		int ponteiro = this.getPosicaoNo(noPartida.getDescricao());
		No noAtual = nos.get(ponteiro);
		ArrayList<No> nosNaoPercorridos = new ArrayList<No>();
		ArrayList<No> nosPercorridos = new ArrayList<No>();
		No noAnterior=null;
		
		nosNaoPercorridos.addAll(this.nos);
		noPartida.setDistance(0);
		
		while(!nosNaoPercorridos.isEmpty()){
			No noMenorDist = getNoMenorDistancia(nosNaoPercorridos);
			if(noMenorDist.getDistance()==Integer.MAX_VALUE){
				break;
			}
			nosNaoPercorridos.remove(noMenorDist);
			noMenorDist.setVisited(true);
			nosPercorridos.add(noMenorDist);
			
			for(No noVizinho : noMenorDist.getVizinhos()){
				if(!noVizinho.isVisited()){
					int alt = noMenorDist.getDistance()+noMenorDist.distanciaEntre(noVizinho);
					if(alt<noVizinho.getDistance()){
						noVizinho.setDistance(alt);
						noAnterior=noMenorDist;
					}
				}
			}
		}
		
		return new Grafo(nosPercorridos);
	}
	
	
	
	
	private No getNoMenorDistancia(ArrayList<No> nosNaoPercorridos){
		No menorDistancia = nosNaoPercorridos.get(0);
		for(No n: nosNaoPercorridos){
			if(n.getDistance()>menorDistancia.getDistance()){
				menorDistancia = n;
			}			
		}
		return menorDistancia;
	}
	
	private Integer getPosicaoNo(String descricao){
		for(int i=0;i<nos.size();i++){
			if(nos.get(i).getDescricao().equals(descricao)){
				return i;
			}
		}
		return -1;
	}

}
