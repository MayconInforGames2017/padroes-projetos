package br.upe.processosoftware.nullobject.refatorado;

import javax.servlet.http.HttpServletRequest;

import br.upe.processosoftware.nullobject.Carrinho;
import br.upe.processosoftware.nullobject.CarrinhoFactory;

public class VisualizacaoCarrinhoNullObject {

	public void carregarInformacoesCarrinho(HttpServletRequest request) {
		Carrinho carrinho = CarrinhoFactory.criarCarrinho(request);
			
		request.setAttribute("valor", carrinho.getValor());
		request.setAttribute("tamanho", carrinho.getTamanho());
		request.setAttribute("avatar", "<img href='img/avatars/'" + carrinho.getNomeUsuario()+ ".png>");
		}
	
}
