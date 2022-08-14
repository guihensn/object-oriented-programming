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
		 if(alunos.length == tamanho()) {             //Se precisar de mais espaço
			 garantaEspaco();				
		 }
		  
		 alunos[tamanho()] = aluno; 				 //Coloca na última posição oculpada
	}

	//----------------Adiciona na posição-----------------------------\\
	public void adiciona(int pos, Aluno aluno) {
		if(posicaoValida(pos)) {
			
			if(alunos.length == tamanho()) {             //Se precisar de mais espaço
				 garantaEspaco();				
			 }
			
			 if(posicaoOcupada(pos)) {
				 for(int i=tamanho(); i>= pos; i--) {    //Vai jogando os elementos para frente( começando do final para não sobrepor os que existem)
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
	
	//-----------Retorna o aluno se a posição for válida------------------\\
	public Aluno pega(int pos) {
		if(posicaoValida(pos)) {
			return alunos[pos];
		}	
		
		return null;
	}
	
	//-----------Remove o aluno na posição------------------\\
	public void remove(int pos) {
		if(posicaoValida(pos)) {
			 alunos[pos] = null; //Apaga na posição
			
			 for(int i = pos; i<= tamanho(); i++) {  //Vai jogando os elementos para traz, começando da posicao do removido para não sobrepor)
					alunos[i] = alunos[i+1];
			 }
		}
	}
	
	//----------Verifica se possui--------------------------\\
	public Boolean contem(Aluno aluno) {
		Boolean sucesso = false;
		
		for(int i=0; i<= tamanho(); i++) {  //Vai jogando os elementos para traz, começando da posicao do removido para não sobrepor)
			if(alunos[i] == aluno) {
				sucesso = true;
			}
		}
	 
		 return sucesso;
	}
	
	//--------Se a posição está oculpada------------------\\
	private Boolean posicaoOcupada(int pos) {
		Boolean Sucesso = false;
		
		if(alunos[pos]!= null) {
			Sucesso = true;
		}
		
		return Sucesso;
	}
	
	//--------Se a posição está oculpada------------------\\
	private Boolean posicaoValida(int pos) {
		Boolean Sucesso = false;
		
		if(pos<tamanho()) {
			Sucesso = true;
		}
		
		return Sucesso;
	}
	
	//-----Se precisar de mais espaço, acrescenta dez posições vazias-----\\
	private void garantaEspaco() {
		Aluno[] novoAlunos = new Aluno[alunos.length+10];
		
		for(int i=0; i<alunos.length; i++) {
			novoAlunos[i] = alunos[i];
		}
		
		totalDeAlunos++;
		alunos = novoAlunos;		
	}
}
