
public class Elevador {	
   private int andar = 0,                 
	           qtd_pessoas = 0,
	           qtd_andares = 0,
	           capacidade_elevador = 0;
	   
   
   
   public int getAndar() {
	   return andar;
   }

   public int getQtd_pessoas() {
	  return qtd_pessoas;
   }

   public int getQtd_andares() {
	  return qtd_andares;
    }



   public int getCapacidade_elevador() {
	   return capacidade_elevador;
   }



	public Elevador(int qtd_andares , int capacidade_elevador ) {  
		   this.qtd_andares = qtd_andares;
		   this.capacidade_elevador = capacidade_elevador;   
	   }
   
   public void Entra() {
	   if(qtd_pessoas < capacidade_elevador) {
		   qtd_pessoas +=1;
	   }
   }
   
   public void Sai() {
	   if(qtd_pessoas > 0 ) {
		   qtd_pessoas -=1;
	   }
   }
   
   public void Sobe() {
	   if(andar < qtd_andares) {
		   andar +=1;
	   }
   }
   public void Desce() {
	   if(andar > 0) {
		   andar -=1;
	   }
   }
   
   
   
}
