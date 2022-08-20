package Classes;

public class Livro {
	int id;
	String titulo, autor;
	public boolean emprestado;
	
	public Livro(int id, String titulo, String autor, boolean emprestado) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = emprestado;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", emprestado=" + emprestado + "]";
	}

	
}
