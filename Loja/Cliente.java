import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String cpf;
	private String nome;
	private List<Telefone> listtel = new ArrayList<Telefone>();

	public Cliente(String cpf, String nome, String numero) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		
		Telefone tel1 = new Telefone(numero);
		listtel.add(tel1);
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", listtel=" + listtel + "]";
	}



	public boolean addTelefone(String numero) {
		boolean sucesso = false;
		Telefone tel1 = new Telefone(numero);
		
		if(!listtel.contains(tel1) && listtel.size() < 5) {
			listtel.add(tel1);
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean removeTelefone(String numero) {
		boolean sucesso = false ;
		Telefone tel1 = new Telefone(numero);
				
		if( listtel.contains(tel1) && listtel.size() > 1 ) {
			listtel.remove(tel1);
			sucesso = true;
		}
		return sucesso;
	}

}
