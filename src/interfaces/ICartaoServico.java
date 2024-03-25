package interfaces;

import java.util.List;

import entidades.Atleta;
import entidades.Cartao;

public interface ICartaoServico {
	public void adicionarCartao(Cartao cartao);
	 public List<Cartao> listarCartoes();
	 public Cartao buscarPorAtleta(Atleta atleta) ;
	 public void atualizarCartao(Cartao cartaoAtualizado) ;
	 public boolean removerCartao(Atleta atleta);
}
