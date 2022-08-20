package Conta;

public class Contas {
     String Data_Leitura , Data_Pagamento;
     
     float Numero_Leitura,
           Valor_Conta,
           Media_Consumo;
	
	public String getData_Leitura() {
		return Data_Leitura;
	}
	
	public void setData_Leitura(String data_Leitura) {
		Data_Leitura = data_Leitura;
	}
	
	public String getData_Pagamento() {
		return Data_Pagamento;
	}
	
	public void setData_Pagamento(String data_Pagamento) {
		Data_Pagamento = data_Pagamento;
	}
	
	public float getNumero_Leitura() {
		return Numero_Leitura;
	}
	
	public void setNumero_Leitura(float numero_Leitura) {
		Numero_Leitura = numero_Leitura;
	}
	
	public float getValor_Conta() {
		return Valor_Conta;
	}
	
	public void setValor_Conta(float valor_Conta) {
		Valor_Conta = valor_Conta;
	}
	
	public float getMedia_Consumo() {
		return Media_Consumo;
	}

	public void setMedia_Consumo(float media_Consumo) {
		Media_Consumo = media_Consumo;
	}
           
     
}