package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

 

public interface IBaseRepositorio<Entidade> {

	public long salvar(Entidade e);		
	public ArrayList<Entidade> listarTodos() ;
	 
}
