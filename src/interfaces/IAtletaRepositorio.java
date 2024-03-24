package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import entidades.Atleta;
import entidades.enums.PosicaoAtletaEnum;

public interface IAtletaRepositorio {
	public ArrayList<Atleta> persquisarPorPosicao( PosicaoAtletaEnum posicao)  throws SQLException;
	public ArrayList<Atleta> persquisarPorCamisaNumero(  int numeroCamisa)  throws SQLException;
	

}
