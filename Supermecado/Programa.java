import java.math.BigDecimal;

public class Programa {

	public static void main(String[] args) {
		Cliente Dory = new Cliente("Dory");
		Cliente Caroline = new Cliente("Caroline");
		
		CarrinhoDeCompras DoryCompras = new CarrinhoDeCompras();
		CarrinhoDeCompras CarolineCompras = new CarrinhoDeCompras();
		
		Produto computador = new Produto(new Long(55),"Computador", new BigDecimal(3500.00));
		Produto monitor = new Produto(new Long(15),"Monitor", new BigDecimal(500.00));
		Produto mouse = new Produto(new Long(45),"Mouse", new BigDecimal(35.00));
		Produto teclado = new Produto(new Long(45),"Teclado", new BigDecimal(100.00));
		
		Item item1 = new Item(1, computador);
		Item item2 = new Item(2, monitor);
		Item item3 = new Item(3, mouse);
		Item item4 = new Item(1, teclado);
		

		DoryCompras.adicionarItem(item2);
		
		CarolineCompras.adicionarItem(item3);
		CarolineCompras.adicionarItem(item4);
		
		System.out.print("Cliente : Dory");

	}
	
	
}
