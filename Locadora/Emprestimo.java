package Classes;

public class Emprestimo {
	int id;
	String dtEmprestimo, dtDevolucao;
	
	Livro livro;
	Pessoa pessoa;
	
	public Emprestimo(int id, String dtEmprestimo, String dtDevolucao, Livro livro, Pessoa pessoa) {
		this.id = id;
		this.dtEmprestimo = dtEmprestimo;
		this.dtDevolucao = dtDevolucao;
		
		this.livro = livro;
		livro.emprestado = true;  // Informa a o livro que ele foi emprestado
		
		this.pessoa = pessoa;
		
		
	}
	
	public boolean trocaPessoa(Pessoa pessoa) {
		boolean Sucesso = false;
		
		if(pessoa != null) {
			this.pessoa = pessoa;
			Sucesso = true;
	    }
		
		return Sucesso;
	}
	
	public boolean trocaLivro(Livro livro) {
		boolean Sucesso = false;
		
		if(livro != null) {
			this.livro.emprestado = false; // Informa ao livro que ele foi devolvido
			livro.emprestado = true;       // Informa ao novo livro que ele foi emprestado
			 
			this.livro = livro;
			Sucesso = true;
	    }
		
		return Sucesso;	
	}

	@Override
	public String toString() {
		return "\nEmprestimo \n id=" + id + "\n dtEmprestimo=" + dtEmprestimo + ", \n dtDevolucao=" + dtDevolucao + ",\n livro="
				+ livro + ",\n pessoa=" + pessoa + "]";
	}
	
	
}
