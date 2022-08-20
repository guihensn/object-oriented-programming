import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
 
public class CarrinhoDeCompras {
	BigDecimal valorTotal;
	Set<Item> Itens = new HashSet<Item>();
	
	public CarrinhoDeCompras() {
		super();
	}

	public CarrinhoDeCompras(Set<Item> itens) {
		super();
		Itens = itens;
	}	
	
	public void adicionarItem(Item item) {
		Itens.add(item);
		valorTotal.add(item.getValor());
        
	}
	
	public void removerItem(Item item) {
		Itens.remove(item);
		valorTotal.subtract(item.getValor());
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras [ValorTotal=" + valorTotal + ", Itens=" + Itens + "]";
	}
	
	
}
