package Excepciones;

public class ErrorParametrosException extends RuntimeException {

    private static final long serialVersionUID = 1L;
	
	public ErrorParametrosException() {
		super(String.format("Los parametros son erroneos!"));
	}
}
