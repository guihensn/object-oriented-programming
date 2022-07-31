package Q5;

public class B implements A {
	private float a, b;
	public boolean Resultado; 

	public B(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void IsTrue() {
		// TODO Auto-generated method stub
		Resultado = true;
	}

	@Override
	public void IsFalse() {
		// TODO Auto-generated method stub
		Resultado = false;
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", Resultado=" + Resultado + "]";
	}
	
	
}
