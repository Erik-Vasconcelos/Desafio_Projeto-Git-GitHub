package one.digitalinnovation.apidocumentada.handlers;

public class BusinessException extends RuntimeException{
	public BusinessException(String mensagem) {
		super(mensagem);
	}
	public BusinessException(String mensagem, Object ... params) {
		super(String.format(mensagem, params));
	}
}
