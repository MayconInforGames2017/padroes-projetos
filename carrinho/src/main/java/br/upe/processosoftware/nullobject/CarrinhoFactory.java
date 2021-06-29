package br.upe.processosoftware.nullobject;

import javax.servlet.http.HttpServletRequest;

public class CarrinhoFactory {
	
	public static Carrinho criarCarrinho(HttpServletRequest request) {
		Carrinho carrinho = null;
		
		if (request.getSession().getAttribute("carrinho") != null) {
			carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
		}
		return carrinho;
	}

}
