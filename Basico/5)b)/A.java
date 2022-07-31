package Q5;

public class A {
	private B b ;
	
	public A(float c, float d) {
		super();
		b = new B(c,d);
		
	}
	
	public boolean TrocaB(float c, float d) {
		boolean sucesso = false;	
		B b2 = new B(c,d);
		
		if(!b.equals(b2) ) {
			b = b2;
			sucesso = true;
		}
		
		return sucesso;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}
