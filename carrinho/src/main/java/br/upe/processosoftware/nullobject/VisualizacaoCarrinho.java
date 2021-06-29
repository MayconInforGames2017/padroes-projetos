package br.upe.processosoftware.nullobject;

import javax.servlet.http.HttpServletRequest;

public class VisualizacaoCarrinho {

	public void carregarInformacoesCarrinho(HttpServletRequest request) {
		Carrinho carrinho = CarrinhoFactory.criarCarrinho(request);
		
		if (carrinho == null) {
			request.setAttribute("valor", Double.valueOf(0));
			request.setAttribute("tamanho", Double.valueOf(0));
		}
		else {
			if (carrinho.getValor() == null) {
				request.setAttribute("valor", Double.valueOf(0));
				request.setAttribute("tamanho", Double.valueOf(0));
			}
			else {
				request.setAttribute("valor", carrinho.getValor());
				request.setAttribute("tamanho", carrinho.getTamanho());
			}
		}
		
		if (carrinho != null && carrinho.getNomeUsuario() == null) {
			request.setAttribute("avatar", "<img href='img/avatars/'anonimo.png>");
		}
		else {
			request.setAttribute("avatar", "<img href='img/avatars/'" + carrinho.getNomeUsuario() + " .png>");
		}
	}
	
}
