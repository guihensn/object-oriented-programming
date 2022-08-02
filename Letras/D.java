import java.util.ArrayList;
import java.util.List;

public abstract class D implements I {
	private String d;
	private List<C> lista_c = new ArrayList<C>();
	
	
	public D(String d, C c) {
		super();
		this.d = d;

		addC(c);
	}


	public void addC(C c){
		if(c!=null ){
			if(!lista_c.contains(c)){
				lista_c.add(c);
			}		
		}
	}
	
	public void delC(C c){
		if(c!=null ){
			if(lista_c.contains(c) && lista_c.size() > 1){
				lista_c.remove(c);
			}		
		}
	}
	
	public void imprimirRelatorio(){
		System.out.print(lista_c);
	}
	
}
