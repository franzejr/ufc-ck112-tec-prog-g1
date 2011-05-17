package algoritmo;

import estrutura.Aresta;
import estrutura.Grafo;
import estrutura.MySet;
import estrutura.OrderedVector;
import estrutura.Vertice;

public class Prim {
	
	public MySet<Aresta> primVetorOrdenado(Grafo g){
		
		Vertice u = g.getVertices().getElements().get(0);
		
		//essa parte deve ser feito com um heap
		OrderedVector arestas = new OrderedVector(u.getArestas());
		
		MySet<Vertice> T = new MySet<Vertice>();
		MySet<Aresta> S = new MySet<Aresta>();
		T.addElement(u);
		
		
		while(T.getElements().size() < g.getVertices().getElements().size()){
			
			
			Aresta uv = arestas.deleteFirst();
			S.addElement(uv);
			Vertice v = uv.getV2();
			T.addElement(v);
			int index = 0;
			for(Vertice w:v.getVizinhos()){
				Aresta vw = v.getArestas().get(index);
				if(T.getElements().contains(w)){
					arestas.remove(vw);
				}else{
					arestas.addElement(vw);
				}
				index ++;
			}
		}
		
		return S;
	}
	
	 

}
