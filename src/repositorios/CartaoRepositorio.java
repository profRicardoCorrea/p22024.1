package repositorios;
 

import java.util.ArrayList;
import java.util.List;

import entidades.Atleta;
import entidades.Cartao;
import interfaces.ICartaoRepositorio;
public class CartaoRepositorio implements ICartaoRepositorio {
	private List<Cartao> cartoes = new ArrayList<>();
	
	public CartaoRepositorio(List<Cartao> cartoes ) {
		  this.cartoes = cartoes;
	}

	@Override
	public void salvar(Cartao cartao) {
		this.cartoes.add(cartao);
		
	}

	@Override
	public List<Cartao> listarCartoes() {
		 return cartoes;
	}

	@Override
	public Cartao buscarPorAtleta(Atleta atleta) {
		for (Cartao cartao : cartoes) {
            if (cartao.getAtleta().equals(atleta)) {
                return cartao;
            }
        }
        return null;
	}

	@Override
	public void atualizarCartao(Cartao cartaoAtualizado) {
		for (int i = 0; i < cartoes.size(); i++) {
            if (cartoes.get(i).getAtleta().equals(cartaoAtualizado.getAtleta())) {
                cartoes.set(i, cartaoAtualizado);
                break;
            }
        }
		
	}

	@Override
	public boolean removerCartao(Atleta atleta) {
		return cartoes.removeIf(cartao -> cartao.getAtleta().equals(atleta));
	}
	 
 
}
