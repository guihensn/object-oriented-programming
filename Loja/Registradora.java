import java.util.ArrayList;
import java.util.List;

public class Registradora {
	int identificador;
	private List<Venda> listaDeVendas = new ArrayList<Venda>();
	
	
	public Registradora(int identificador) {
		super();
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Registradora [identificador=" + identificador + ", listaDeVendas=" + listaDeVendas + "]";
	}

	public boolean addVenda(Venda venda) {
		boolean sucesso = false;
		
		if(!listaDeVendas.contains(venda)) {
			listaDeVendas.add(venda);
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean removeVenda(Venda venda) {
		boolean sucesso = false;
		
		if( listaDeVendas.size() > 0 && listaDeVendas.contains(venda)) {
			listaDeVendas.remove(venda);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public int qtdeDeVendas () {
		int qtde = 0;
		
		for(Venda venda : listaDeVendas) {
			qtde += 1;
		}
		return qtde;
	}
	
	
}
