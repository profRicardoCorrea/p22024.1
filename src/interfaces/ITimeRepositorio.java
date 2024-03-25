package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Time;

 
public interface ITimeRepositorio {
	 
	public ArrayList<Time> persquisarPorNome(String nome) ;	
	public void atualizar(Time timeAtulizadao);
	public boolean remover(Time time);
	public Time listarPorCodigo(long codigo) ;
	 
	

}
