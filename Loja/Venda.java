import java.util.ArrayList;
import java.util.List;

public class Venda {
	String dataHora;
	private List<ItemDeVenda> listaItemDeVenda = new ArrayList<ItemDeVenda>();
	private Cliente cliente;
	
	
	public Venda(String dataHora, Cliente cliente, int qtde, Produto produto) {
		super();
		this.dataHora = dataHora;
		this.cliente = cliente;
		
		listaItemDeVenda.add(new ItemDeVenda(qtde, produto));

	}
	
	@Override
	public String toString() {
		return "Venda [dataHora=" + dataHora + ", listaItemDeVenda=" + listaItemDeVenda + ", cliente=" + cliente + "]";
	}

	public void trocaCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public boolean addItem(int qtde, Produto produto) {
		boolean sucesso = false;
		ItemDeVenda itemDeVenda = new ItemDeVenda(qtde, produto);
		
		if( !listaItemDeVenda.contains(itemDeVenda) ) {
			listaItemDeVenda.add(itemDeVenda);
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean removeItem(int qtde, Produto produto) {
		boolean sucesso = false;
		ItemDeVenda itemDeVenda = new ItemDeVenda(qtde, produto);
		
		if(listaItemDeVenda.size() > 1 && listaItemDeVenda.contains(itemDeVenda) ) {
			listaItemDeVenda.remove(itemDeVenda);
			sucesso = true;
		}
		return sucesso;
	}
	
	public float valorDaVenda() {
		float valor = 0;
		
		for(ItemDeVenda item : listaItemDeVenda) {
			valor+=item.getProd().valor*item.getQtde();	
		}
	
		return valor;
	}
	
}
