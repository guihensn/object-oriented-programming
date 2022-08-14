import java.util.Arrays;

public class Vetor {
	private int totalDeAlunos ;
	private Aluno[] alunos = new Aluno[10];

	public int getTotalDeAlunos() {
		return tamanho();
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
	
	//---------------Adiciona no fim do vetor-----------------------\\
	public void adiciona(Aluno aluno) {
		 if(alunos.length == tamanho()) {             //Se precisar de mais espa�o
			 garantaEspaco();				
		 }
		  
		 alunos[tamanho()] = aluno; 				 //Coloca na �ltima posi��o oculpada
	}

	//----------------Adiciona na posi��o-----------------------------\\
	public void adiciona(int pos, Aluno aluno) {
		if(posicaoValida(pos)) {
			
			if(alunos.length == tamanho()) {             //Se precisar de mais espa�o
				 garantaEspaco();				
			 }
			
			 if(posicaoOcupada(pos)) {
				 for(int i=tamanho(); i>= pos; i--) {    //Vai jogando os elementos para frente( come�ando do final para n�o sobrepor os que existem)
						alunos[i+1] = alunos[i];
				 }
			 }
			 
			 alunos[pos] = aluno;
		}	 
	}
	
	//-----------Quantos elementos ocupados do vetor------------------\\
	public int tamanho() {
		int count = 0;
		
		for(int i=0; i<alunos.length; i++) {
			if(alunos[i]!= null) {
				count++;
			}
		}
		
		return count;
	}
	
	//-----------Retorna o aluno se a posi��o for v�lida------------------\\
	public Aluno pega(int pos) {
		if(posicaoValida(pos)) {
			return alunos[pos];
		}	
		
		return null;
	}
	
	//-----------Remove o aluno na posi��o------------------\\
	public void remove(int pos) {
		if(posicaoValida(pos)) {
			 alunos[pos] = null; //Apaga na posi��o
			
			 for(int i = pos; i<= tamanho(); i++) {  //Vai jogando os elementos para traz, come�ando da posicao do removido para n�o sobrepor)
					alunos[i] = alunos[i+1];
			 }
		}
	}
	
	//----------Verifica se possui--------------------------\\
	public Boolean contem(Aluno aluno) {
		Boolean sucesso = false;
		
		for(int i=0; i<= tamanho(); i++) {  //Vai jogando os elementos para traz, come�ando da posicao do removido para n�o sobrepor)
			if(alunos[i] == aluno) {
				sucesso = true;
			}
		}
	 
		 return sucesso;
	}
	
	//--------Se a posi��o est� oculpada------------------\\
	private Boolean posicaoOcupada(int pos) {
		Boolean Sucesso = false;
		
		if(alunos[pos]!= null) {
			Sucesso = true;
		}
		
		return Sucesso;
	}
	
	//--------Se a posi��o est� oculpada------------------\\
	private Boolean posicaoValida(int pos) {
		Boolean Sucesso = false;
		
		if(pos<tamanho()) {
			Sucesso = true;
		}
		
		return Sucesso;
	}
	
	//-----Se precisar de mais espa�o, acrescenta dez posi��es vazias-----\\
	private void garantaEspaco() {
		Aluno[] novoAlunos = new Aluno[alunos.length+10];
		
		for(int i=0; i<alunos.length; i++) {
			novoAlunos[i] = alunos[i];
		}
		
		totalDeAlunos++;
		alunos = novoAlunos;		
	}
}
