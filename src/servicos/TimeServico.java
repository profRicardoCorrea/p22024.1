package servicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entidades.Time;
import excecoes.CodigoInvalidoException;
import excecoes.DataNascimentoInvalidaException;
import excecoes.NomeTimeInvalidoException;
import excecoes.PontosInvalidosException;
import interfaces.ITimeServico;
import repositorios.TimeRepositorio;

public class TimeServico implements ITimeServico {

	private TimeRepositorio repositorioTime = null;

	public TimeServico(TimeRepositorio repositorioTime) {
		this.repositorioTime = repositorioTime;
	}

	@Override
	public void cadastrar(Time time) throws NomeTimeInvalidoException, DataNascimentoInvalidaException {
		if (time.getNome() == null || time.getNome().trim().isEmpty() || time.getNome().length() < 4) {
			throw new NomeTimeInvalidoException("");
		}
		if (time.getDataNascimento() == null) {
			throw new DataNascimentoInvalidaException();
		}

		if (!time.getNome().isBlank() && !time.getNome().isEmpty() && time.getNome().length() >= 4) {
			repositorioTime.salvar(time);
		}
	}

	@Override
	public void alterar(Time time) throws NomeTimeInvalidoException, DataNascimentoInvalidaException {

		if (time.getNome() == null || time.getNome().trim().isEmpty() || time.getNome().length() < 4) {
			throw new NomeTimeInvalidoException("NOME");
		}
		if (time.getDataNascimento() == null) {
			throw new DataNascimentoInvalidaException();
		}
		repositorioTime.atualizar(time);

	}

	@Override
	public ArrayList<Time> persquisar(String nome) throws NomeTimeInvalidoException {
		if (nome == null || nome.trim().isEmpty() || nome.length() < 4) {
			throw new NomeTimeInvalidoException("NOME");
		}
		return repositorioTime.persquisarPorNome(nome);
	}

	@Override
	public boolean excluir(Time time) throws CodigoInvalidoException {

		if (time.getCodigo() > 0) {
			throw new CodigoInvalidoException();
		} else {

			Time timeResult = repositorioTime.listarPorCodigo(time.getCodigo());
			if (timeResult != null) {
				repositorioTime.remover(time);
				return true;
			}
			return false;
		}

	}

	public ArrayList<Time> listarTodosTimes() {

		return (ArrayList<Time>) this.repositorioTime.listarTodos();
	}

	public Time pesquisarPorCodigo(long codigo) {

		if (codigo > 0)
			return repositorioTime.listarPorCodigo(codigo);

		System.out.println("Codigo Invalido");
		return null;

	}

	@Override
	public ArrayList<Time> persquisarClassificacao() {
		List<Time> listaTimes = this.repositorioTime.listarTodos();
		Collections.sort(listaTimes,
				(Comparator<? super Time>) (Time t1, Time t2) -> Integer.compare(t2.getPontos(), t1.getPontos()));
		return (ArrayList<Time>) listaTimes;
	}

	@Override
	public void addPontos(long codigo, int pontos)
			throws PontosInvalidosException, NomeTimeInvalidoException, DataNascimentoInvalidaException {
		if (pontos < 0) {
			throw new PontosInvalidosException(pontos);
		} else {
			Time resultado;
			try {
				resultado = repositorioTime.listarPorCodigo(codigo);
				resultado.setPontos(pontos);
				this.alterar(resultado);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
