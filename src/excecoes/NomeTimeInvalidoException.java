package excecoes;

public class NomeTimeInvalidoException extends TimeException {

	public NomeTimeInvalidoException(String nome) {
		super("Nome de time inválido: " + nome);
	}

}
