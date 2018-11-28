import java.util.ArrayList;

public class Grafo {

	private ArrayList<Vertices> vertices = new ArrayList();
	private ArrayList<Aresta> arestas = new ArrayList();
	private int kcores = 1;

	public void grauM() {
		Vertices v = new Vertices();
		for(int i =0; i<vertices.size();i++) {
			v=vertices.get(i);
			v.setGrau(v.getVerticesAdj().size());
		
		}
	}
	
	public void pintarVert(Vertices v, int k) {
	
	}
	
	public void addArrayV(Vertices v) {
		
		if(!this.vertices.contains(v)){
			this.vertices.add(v);
		}
		
	}
	
	public void addArrayA(Aresta a) {
				
		if(a.getV1()!=null && a.getV2()!=null){	
			if(!this.arestas.contains(a)){
				Aresta b = new Aresta(a.getV2(), a.getV1());
				if(!this.arestas.contains(b)) {
					//ADD ARESTA AO ARRAY
					this.arestas.add(a);
					
					//ADD GRAU DO VERTICE
					//this.grauM(a.getV1());
					//this.grauM(a.getV2());
				
					//ADD VERTICES AO ARRAY
					this.addArrayV(a.getV1());
					this.addArrayV(a.getV2());
					
					
					//ADD VERTICES ADJACENTES
					a.getV1().getVerticesAdj().add(a.getV2());
					a.getV2().getVerticesAdj().add(a.getV1());
				
				}
			}
			
		}
	}
	
	public Vertices getVMG() {
		Vertices v = new Vertices();
		for(int i=0;i<vertices.size();i++) {
			if(v.getGrau() <= vertices.get(i).getGrau()) {
				if(v.getGrau() == vertices.get(i).getGrau()) {
					if(v.getCor()==0) {
						continue;		
					}
				}else {					
					if(vertices.get(i).getCor() == 0) {
					v= this.vertices.get(i);
					}
				}
			}			
		}
		return v;
	}
	
	
	public void colorir(Vertices v) {
		for(int i = 0; i<v.getVerticesAdj().size();i++) {
			if(v.getCor() == v.getVerticesAdj().get(i).getCor()) {
				v.setCor(v.getCor()+1);
				this.colorir(v);
				if(this.kcores<v.getCor())
					kcores++;
			}			
		}
	}
	
	public void executar() {
		Vertices v = new Vertices();
		this.grauM();
		for(int i=0;i<this.getVertices().size();i++) {
			v = this.getVMG();
			v.setCor(1);
			this.colorir(v);
			
		}
	}
	
	
	public ArrayList<Vertices> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<Vertices> vertices) {
		this.vertices = vertices;
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(ArrayList<Aresta> arestas) {
		this.arestas = arestas;
	}

	public int getKcores() {
		return kcores;
	}

	public void setKcores(int kcores) {
		this.kcores = kcores;
	}

}