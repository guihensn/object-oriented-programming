package Q5;

public class B extends A 
{
	private float a, b;

	public B(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void d() {
	   g = "abacate";
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", g=" + g + "]";
	}
	
}
