import java.util.HashSet;
import java.util.Set;
import java.math.BigDecimal;

public class Item {
	int  quantidade;
	Produto produto ;
	
	public Item(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}
	public BigDecimal getValor() {
		return BigDecimal.valueOf( quantidade ).multiply( produto.valor );
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
