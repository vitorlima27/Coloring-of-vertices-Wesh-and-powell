public class Main {
	
	public static void main(String args[]) {
		
		Main m = new Main();
		
		System.out.println("COLORAÇÃO DE GRAFOS!!");
		System.out.println("===========");
		System.out.println(" ");
		
		
		m.grafo6();
		
		System.out.println("");
		System.out.println("===========");
		System.out.println(" ");
		
		m.grafoABCD();
		
		System.out.println("");
		System.out.println("===========");
		System.out.println(" ");
		
		m.grafo666();
		
			
		}
	
	public void crieSeuGrafo() {
		
	}
	
	public void grafo6() {
		
		Grafo g = new Grafo();
		
		System.out.println("GRAFO 1 2 3 4 5 6");
		
		Vertices v1 = new Vertices(1);
		Vertices v2 = new Vertices(2);
		Vertices v3 = new Vertices(3);
		Vertices v4 = new Vertices(4);
		Vertices v5 = new Vertices(5);
		Vertices v6 = new Vertices(6);
		
		Aresta a1 = new Aresta(v1,v2);
		Aresta a2 = new Aresta(v1,v3);
		Aresta a3 = new Aresta(v1,v5);
		Aresta a4 = new Aresta(v2,v5);
		Aresta a5 = new Aresta(v3,v5);
		Aresta a6 = new Aresta(v3,v6);
		Aresta a7 = new Aresta(v5,v6);
		Aresta a8 = new Aresta(v6,v4);
		
		g.addArrayA(a1);
		g.addArrayA(a2);
		g.addArrayA(a3);
		g.addArrayA(a4);
		g.addArrayA(a5);
		g.addArrayA(a6);
		g.addArrayA(a7);
		g.addArrayA(a8);
			
		g.executar();
			
		System.out.println("CORES NECESSÁRIAS: " + g.getKcores());
		for(int i=0;i<g.getVertices().size();i++) {
			System.out.println("Vértice: " + g.getVertices().get(i).getNum() + " Cor: " 
							+ g.getVertices().get(i).getCor() + " grau " + g.getVertices().get(i).getGrau());
		}
			
	}
	
	public void grafoABCD() {
		Grafo g = new Grafo();
		
		System.out.println("GRAFO ABCD ");
		
		Vertices v1 = new Vertices(1);
		Vertices v2 = new Vertices(2);
		Vertices v3 = new Vertices(3);
		Vertices v4 = new Vertices(4);
					
				
		Aresta a1 = new Aresta(v1,v2);
		Aresta a2 = new Aresta(v1,v3);
		Aresta a3 = new Aresta(v1,v4);
		Aresta a4 = new Aresta(v2,v2);
		Aresta a5 = new Aresta(v2,v4);
		Aresta a6 = new Aresta(v3,v4);
		
		g.addArrayA(a1);
		g.addArrayA(a2);
		g.addArrayA(a3);
		g.addArrayA(a4);
		g.addArrayA(a5);
		g.addArrayA(a6);		
	
		g.executar();
		
		
				
		System.out.println("CORES NECESSÁRIAS: " + g.getKcores());
		for(int i=0;i<g.getVertices().size();i++) {
			System.out.println("Vértice: " + g.getVertices().get(i).getNum() + " Cor: " 
							+ g.getVertices().get(i).getCor() + " grau " + g.getVertices().get(i).getGrau());
		}
	}
	
	public void grafo666() {
		
		Grafo g = new Grafo();
		
		System.out.println("GRAFO DO 666");
		
				Vertices v1 = new Vertices(1);
				Vertices v2 = new Vertices(2);
				Vertices v3 = new Vertices(3);
				Vertices v4 = new Vertices(4);
				Vertices v5 = new Vertices(5);
				
				Aresta a1 = new Aresta(v1,v2);
				Aresta a2 = new Aresta(v1,v3);
				Aresta a3 = new Aresta(v1,v4);
				Aresta a4 = new Aresta(v1,v5);
				Aresta a5 = new Aresta(v2,v3);
				Aresta a6 = new Aresta(v2,v4);
				Aresta a7 = new Aresta(v2,v5);
				Aresta a8 = new Aresta(v3,v4);
				Aresta a9 = new Aresta(v3,v5);
				Aresta a10 = new Aresta(v4,v5);
				

				g.addArrayA(a1);
				g.addArrayA(a2);
				g.addArrayA(a3);
				g.addArrayA(a4);
				g.addArrayA(a5);
				g.addArrayA(a6);
				g.addArrayA(a7);
				g.addArrayA(a8);
				g.addArrayA(a9);
				g.addArrayA(a10);

				g.executar();
				
				System.out.println("CORES NECESSÁRIAS: " + g.getKcores());
				for(int i=0;i<g.getVertices().size();i++) {
					System.out.println("Vértice: " + g.getVertices().get(i).getNum() + " Cor: " 
									+ g.getVertices().get(i).getCor() + " grau " + g.getVertices().get(i).getGrau());
				}
	}
	
}
