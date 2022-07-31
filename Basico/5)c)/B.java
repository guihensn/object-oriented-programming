package Q5;

public class B extends A{
	public String e,f;

	public B(int c, int d, String e, String f) {
		super(c, d);
		this.e = e;
		this.f = f;
	}

	@Override
	public String toString() {
		return "B [e=" + e + ", f=" + f + ", c=" + c + ", d=" + d + "]";
	}
}
