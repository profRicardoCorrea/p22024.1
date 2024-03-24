package entidades;

import java.util.Date;

import entidades.enums.CartoesEnum;

import java.util.ArrayList;
import java.util.Date;

 
 
public class Cartao extends EntidadeBasica {
	private CartoesEnum cartao;
	private Date dataAplicacao;
	private Date fimAplicacao;
	private float valorMulta;
	private Atleta atleta;
	public CartoesEnum getCartao() {
		return cartao;
	}
	public void setCartao(CartoesEnum cartao) {
		this.cartao = cartao;
	}
	public Date getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public Date getFimAplicacao() {
		return fimAplicacao;
	}
	public void setFimAplicacao(Date fimAplicacao) {
		this.fimAplicacao = fimAplicacao;
	}
	public float getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(float valorMulta) {
		this.valorMulta = valorMulta;
	}
	

}
