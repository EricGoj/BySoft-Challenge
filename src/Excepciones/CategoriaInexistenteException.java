package Excepciones;

public class CategoriaInexistenteException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CategoriaInexistenteException(String categoria) {
		super(String.format("La categoria  %categoria aun no existe", categoria));
	}
}
