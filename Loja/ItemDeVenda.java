
public class ItemDeVenda {
	private int qtde;
	private Produto prod;
	
	public ItemDeVenda(int qtde, Produto prod) {
		super();
		this.qtde = qtde;
		this.prod = prod;
	}
	
	@Override
	public String toString() {
		return "ItemDeVenda [qtde=" + qtde + ", prod=" + prod + "]";
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
}
