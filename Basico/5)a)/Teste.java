package Q5;

public class Teste {
	
	public static void main(final String[] args)  {
		A a = new A(4,5);
		
		a.addB(3, 2);
		a.addB(1, 5);
	
		a.removeB(3,2);
		
		System.out.println(a.toString());
	}
}
