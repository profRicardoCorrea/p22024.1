package excecoes;

public class CodigoInvalidoException extends TimeException{

	public CodigoInvalidoException() {
		super("Data de nascimento do time é inválida.");
	}
}
