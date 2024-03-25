package excecoes;

public class PontosInvalidosException extends TimeException {

	public PontosInvalidosException(int pontos) {
		super("Número de pontos inválido: " + pontos);
	}
}