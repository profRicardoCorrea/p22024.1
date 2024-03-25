package interfaces;

import java.util.List;

import entidades.Atleta;
import entidades.Cartao;

public interface ICartaoRepositorio {
	 public void salvar(Cartao cartao);
	 public List<Cartao> listarCartoes();
	 public Cartao buscarPorAtleta(Atleta atleta) ;
	 public void atualizarCartao(Cartao cartaoAtualizado) ;
	 public boolean removerCartao(Atleta atleta);
}
