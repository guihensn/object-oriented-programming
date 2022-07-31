package Q5;
import java.util.ArrayList;
import java.util.List;

public class A {
	private List<B> listB = new ArrayList<B>();
	
	public A(float c, float d) {
		super();
		B b = new B(c,d);
		listB.add(b);
	}
	
	public boolean addB(float c, float d) {
		boolean sucesso = false;	
		B b = new B(c,d);
		
		if(!listB.contains(b) || listB.size() < 10) {
			listB.add(b);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean removeB(float c, float d) {
		boolean sucesso = false;	
		B b = new B(c,d);
		
		if(listB.contains(b)) {
			listB.remove(b);
			sucesso = true;
		}
		
		return sucesso;
	}

	@Override
	public String toString() {
		return "A [listB=" + listB + "]";
	}
	
	
}
