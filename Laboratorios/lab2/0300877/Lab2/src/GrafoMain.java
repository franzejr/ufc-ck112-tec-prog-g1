import java.util.ArrayList;
import java.util.List;


public class GrafoMain {

	public static Grafo criarGrafo(){
		
		Grafo novoGrafo = new Grafo();
		List<Vertice> vertices = new ArrayList<Vertice>();
		List<Aresta> arestas = new ArrayList<Aresta>();
		
		
		//Exemplo retirado de http://fr.wikipedia.org/wiki/Algorithme_de_Dijkstra
		
		//Criar vértices
		Vertice a = new Vertice ("A");
		Vertice b = new Vertice ("B");
		Vertice c = new Vertice ("C");
		Vertice d = new Vertice ("D");
		Vertice e = new Vertice ("E");
		Vertice f = new Vertice ("F");
		Vertice g = new Vertice ("G");
		Vertice h = new Vertice ("H");
		Vertice i = new Vertice ("I");
		Vertice j = new Vertice ("J");
		
		//Inserir vértices no grafo
		vertices.add(a);
		vertices.add(b);
		vertices.add(c);
		vertices.add(d);
		vertices.add(e);
		vertices.add(f);
		vertices.add(g);
		vertices.add(h);
		vertices.add(i);
		vertices.add(j);
		novoGrafo.setVertices(vertices);
		
		//Criar arestas
		Aresta ab = new Aresta (a, b);
		ab.setPeso(85);
		Aresta ac = new Aresta (a, c);
		ac.setPeso(217);
		Aresta ae = new Aresta (a, e);
		ae.setPeso(173);
		Aresta bf = new Aresta (b, f);
		bf.setPeso(80);
		Aresta cg = new Aresta (c, g);
		cg.setPeso(186);
		Aresta ch = new Aresta (c, h);
		ch.setPeso(103);
		Aresta ej = new Aresta (e, j);
		ej.setPeso(502);
		Aresta fi = new Aresta (f, i);
		fi.setPeso(250);
		Aresta hd = new Aresta (h, d);
		hd.setPeso(183);
		Aresta hj = new Aresta (h, j);
		hj.setPeso(167);
		Aresta ij = new Aresta (i, j);
		ij.setPeso(84);
		
		//Inserir arestas no grafo;
		
		arestas.add(ab);
		arestas.add(ac);
		arestas.add(ae);
		arestas.add(bf);
		arestas.add(cg);
		arestas.add(ch);
		arestas.add(ej);
		arestas.add(fi);
		arestas.add(hd);
		arestas.add(hj);
		arestas.add(ij);
		novoGrafo.setArestas(arestas);
		
		return novoGrafo;
	}
	
	
	public static void main(String args[]){
		
		Grafo novoGrafo = criarGrafo();
		List<Vertice> menorCaminho = new ArrayList<Vertice>();
		Vertice v1 = new Vertice("v1");
		Vertice v2 = new Vertice("v2");
		v1 = novoGrafo.encontrarVertice(args[0]);
		v2 = novoGrafo.encontrarVertice(args[1]);
		menorCaminho = novoGrafo.encontrarMenorCaminhoDijkstra(v1, v2);
		System.out.println("O menor caminho entre "+args[0]+" e "+args[1]+" é: ");
		for (int i=0;i<menorCaminho.size();i++){
			System.out.print(menorCaminho.get(i).getDescricao()+ " -> ");
			
		}
		
	}
}


