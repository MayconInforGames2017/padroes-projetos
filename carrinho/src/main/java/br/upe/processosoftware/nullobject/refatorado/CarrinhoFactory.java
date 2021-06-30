package br.upe.processosoftware.nullobject.refatorado;

import javax.servlet.http.HttpServletRequest;

import br.upe.processosoftware.nullobject.Carrinho;

public class CarrinhoFactory {

	public static Carrinho criarCarrinho(HttpServletRequest request) {
		Carrinho carrinho = new CarrinhoNullObject();
		
		if (request.getSession().getAttribute("carrinho") != null) {
			carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
		}
		return carrinho;
	}
	
}
