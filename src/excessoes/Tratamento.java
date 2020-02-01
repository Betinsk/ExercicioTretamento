package excessoes;



public class Tratamento extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public Tratamento (String string){
		super(string);
	}

}
