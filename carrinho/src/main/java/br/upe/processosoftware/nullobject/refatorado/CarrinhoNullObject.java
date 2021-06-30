package br.upe.processosoftware.nullobject.refatorado;

import br.upe.processosoftware.nullobject.Carrinho;

public class CarrinhoNullObject extends Carrinho {
	
	@Override
	public Double getValor() {
		return 0.0;
	}
	
	@Override
	public Integer getTamanho() {
		return 0;
	}

	@Override
	public String getNomeUsuario() {
		return "anonimo";
	}
	
}
