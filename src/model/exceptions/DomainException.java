package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	
	public DomainException(String msg) {
		super(msg);//Para instanciar a exce��o passando uma mensagem
	}

}
