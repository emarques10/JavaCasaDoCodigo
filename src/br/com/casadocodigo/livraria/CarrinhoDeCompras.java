package br.com.casadocodigo.livraria;

import br.com.casadocodigo.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: "+ produto);
		//produto.aplicaDescontoDe(0.16);
		total += produto.getValor();
	}
	public double getTotal() {
		return total;
	}

}
