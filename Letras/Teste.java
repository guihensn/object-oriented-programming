
public class Teste {

	
	public static void main(String[] args) {
		C c1 = new C(5);
		C c2 = new C(1);
		C c3 = new C(3);

		B b1 = new B("Ana", "Paula", "Pedro", c1);
		
		b1.addC(c1);
		b1.addC(c2);
		b1.addC(c3);

		b1.delC(c3);

		System.out.println(b1);
		b1.imprimirRelatorio();
	}


}
