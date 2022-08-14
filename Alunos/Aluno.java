
public class Aluno {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	@Override
	public String toString() {
		return  nome ;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
