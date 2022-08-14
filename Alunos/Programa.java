
public class Programa {
	public static void main(String[] args) {
		Vetor lista = new Vetor();
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.setNome("Dory");
		a2.setNome("Caroline");
		a3.setNome("Isabelle");
		a4.setNome("Ana Laura");
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a3)); // false pois ainda não foi adicionado
		
		lista.adiciona(a3);
		System.out.println(lista);
		
		Aluno aluno1 = lista.pega(0);
		System.out.println(aluno1);
		
		lista.remove(0);
		System.out.println(lista);
		
		lista.adiciona(1, a4);
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
		}

}
