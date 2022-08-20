import java.util.ArrayList;
import java.util.List;

public class Produto {
	String descricao;
	float valor;
	private Fornecedor fornecedor;
	
	public Produto(String descricao, float valor, Fornecedor fornecedor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	public Produto(String descricao, float valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
	}

	public boolean addFornecedor(String nome) {
		boolean sucesso = false;
		
		if(fornecedor == null ) {
			fornecedor = new Fornecedor(nome);;
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean removeFornecedor(String nome) {
		boolean sucesso = false ;

		if(fornecedor != null) {
			fornecedor = null;
			sucesso = true;
		}
		return sucesso;
	}

}
