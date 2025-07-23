package br.com.caixa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Carrinho carrinho = new Carrinho();
		
		Produto p1 = new Produto("Arroz", "001", 17.99);
		Produto p2 = new Produto("Feijão", "002", 4.49);
		Produto p3 = new Produto("Macarrão", "003", 3.29);
		
		boolean comprando = true;
		
		while (comprando) {
			System.out.println("Digite o código do produto (001, 002, 003) ou 'fim' para encerrar:");
			String codigo = sc.nextLine();
			
			switch (codigo) {
			case "001":
				carrinho.adicionarProduto(p1);
				break;
			case "002":
				carrinho.adicionarProduto(p2);
				break;
			case "003":
				carrinho.adicionarProduto(p3);
				break;
			case "fim":
				comprando = false;
				break;
			default:
				System.out.println("Código inválido.");
			}
		}
		System.out.println("\n--- Cupom Fiscal ---");
		carrinho.listarProdutos();
		System.out.printf("Total: R$ %.2f\n", carrinho.calcularTotal());
		
		sc.close();
	}

}
