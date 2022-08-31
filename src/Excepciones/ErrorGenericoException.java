package Excepciones;

public class ErrorGenericoException extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ErrorGenericoException() {
		super(String.format("Algo salio mal!"));
	}

}
