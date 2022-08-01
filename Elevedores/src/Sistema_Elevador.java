
public class Sistema_Elevador {
	
   public static void main(String[] args ) {
	   
	   Elevador  elevador_1 = new Elevador(15, 6)  ;
	  
	   elevador_1.Entra();
	   elevador_1.Entra();
	   
	   elevador_1.Sai();
	   
	   elevador_1.Sobe();
	   elevador_1.Sobe();
	   elevador_1.Sobe();
	   
	   System.out.println("Andare atual: "+elevador_1.getAndar());
	   System.out.println("Quantidade de pessoas "+elevador_1.getQtd_pessoas());
   }
}
