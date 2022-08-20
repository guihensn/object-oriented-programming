package Classes;

public class TesteLocadora {
	
	public static void main (final String[] args) {
		Livro liv1= new Livro(2,"A volta ao mundo em oitenta dias", "Juio Verne", false);
		Livro liv2= new Livro(3,"Harry Potter", "J.k.Rowling", false);
		
		Pessoa pes1 = new Pessoa(5, "fulano123@gmail.com", "Fulano de Souza");
		Pessoa pes2 = new Pessoa(6, "Beultraninha@outlook.com","Beatrana Figueiredo");

				
		Emprestimo emp1 = new Emprestimo(3, "12/09/19" , "19/09/19" , liv1 , pes1 );
		System.out.println(emp1.toString());
		
		emp1.trocaLivro(liv2);
		emp1.trocaPessoa(pes2);
		System.out.println(emp1.toString());
	}
}
