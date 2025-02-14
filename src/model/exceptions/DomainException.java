package model.exceptions;

// classe que estabelece uma exceção personalizada para o tratamento de erros na execução

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
