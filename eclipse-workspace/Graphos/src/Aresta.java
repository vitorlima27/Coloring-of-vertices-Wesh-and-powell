
public class Aresta {

	private Vertices v1;
	private Vertices v2;
	
	public Aresta(Vertices v1, Vertices v2) {
		if(!(v1.getNum() == v2.getNum())) {
			this.v1 = v1;
			this.v2 = v2;
		}
		
	}

	public Vertices getV1() {
		return v1;
	}

	public void setV1(Vertices v1) {
		this.v1 = v1;
	}

	public Vertices getV2() {
		return v2;
	}

	public void setV2(Vertices v2) {
		this.v2 = v2;
	}
	
	
}
