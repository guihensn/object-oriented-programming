package Q5;

public class B {
	private float c,d;

	public B(float c, float d) {
		super();
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "B [c=" + c + ", d=" + d + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(c);
		result = prime * result + Float.floatToIntBits(d);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		if (Float.floatToIntBits(c) != Float.floatToIntBits(other.c))
			return false;
		if (Float.floatToIntBits(d) != Float.floatToIntBits(other.d))
			return false;
		return true;
	}


	
}
