package interfaces;

import java.util.ArrayList;
import entidades.Time;
import excecoes.CodigoInvalidoException;
import excecoes.DataNascimentoInvalidaException;
import excecoes.NomeTimeInvalidoException;
import excecoes.PontosInvalidosException;
 
public interface ITimeServico {
	public void cadastrar(Time time) throws NomeTimeInvalidoException, DataNascimentoInvalidaException;	 
	public void alterar(Time time) throws NomeTimeInvalidoException, DataNascimentoInvalidaException;
	public ArrayList<Time> persquisar(String nome) throws NomeTimeInvalidoException;
	public boolean excluir(Time time) throws CodigoInvalidoException;
	public void addPontos(long codigo, int pontos)throws PontosInvalidosException, NomeTimeInvalidoException, DataNascimentoInvalidaException;
	public ArrayList<Time> persquisarClassificacao() ;

}
