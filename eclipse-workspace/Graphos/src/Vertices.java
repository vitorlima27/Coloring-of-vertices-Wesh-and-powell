import java.util.ArrayList;

public class Vertices {
	
	private int num;
	private int grau;
	private int cor;
	private ArrayList<Vertices> verticesAdj = new ArrayList();
	
	public Vertices() {
		super();
	}
	
	public Vertices(int n) {
		this.setNum(n);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public ArrayList<Vertices> getVerticesAdj() {
		return verticesAdj;
	}

	public void setVerticesAdj(ArrayList<Vertices> verticesAdj) {
		this.verticesAdj = verticesAdj;
	}
	
	
	
	
}
