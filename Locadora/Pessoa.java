package Classes;

public class Pessoa {
	int id;
	String email ;
	String nome;
	
	
	public Pessoa(int id, String email, String nome) {
		this.id = id;
		this.email = email;
		this.nome = nome;
	}

	public boolean addEmail(String descricao) {
		boolean Sucesso = false;
		
		if( email == null) {
			email = descricao;
			Sucesso = true;
		}
				
		return Sucesso;
	}
	
	public boolean dropEmail(String descricao) {
		boolean Sucesso = false;
		
		if( email != null) {
			email = null;
			Sucesso = true;
		}
				
		return Sucesso;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", email=" + email + ", nome=" + nome + "]";
	}
	
	
}
