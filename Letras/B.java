
public class B extends D{
	private String b;
	private A a1;
	
	public B(String b, String a , String d, C c ) {
		super(d,  c);
		this.b = b;
		
		this.a1 = new A(a);          
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", a1=" + a1 + "]";
	}

	
	
	
	
}
