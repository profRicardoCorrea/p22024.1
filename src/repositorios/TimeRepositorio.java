package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Time;
import interfaces.ITimeRepositorio;
public class TimeRepositorio extends BaseRepositorio<Time> implements ITimeRepositorio {

	public TimeRepositorio(ArrayList<Time> bdE) {
		super(bdE);		
	}

	@Override
	public ArrayList<Time> persquisarPorNome(String nome) {
		ArrayList<Time> timesEncontrados=new ArrayList<Time>();
		for (Time time : bdE) {
            if (time.getNome().equals(nome)) {
            	timesEncontrados.add(time);
            }
        }
        return timesEncontrados;
	}
	 

	@Override
	public void atualizar(Time timeAtulizadao) {
		for (int i = 0; i < bdE.size(); i++) {
            if (bdE.get(i).getCodigo() == timeAtulizadao.getCodigo()) {
            	bdE.set(i, timeAtulizadao);
                break;
            }
        }		
	}

	@Override
	public boolean remover(Time time) {
		return bdE.removeIf(cartao -> cartao.getCodigo()== time.getCodigo());
	}

	@Override
	public Time listarPorCodigo(long codigo) {
		for (Time time : bdE) {
            if (time.getCodigo()== codigo) {
            	 return time;
            }
        }
		return null;
	}     
}
