package excecoes;

public class DataNascimentoInvalidaException extends TimeException {

	public DataNascimentoInvalidaException() {
		super("Data de nascimento do time é inválida.");
	}
}