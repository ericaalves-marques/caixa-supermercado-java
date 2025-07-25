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
			System.out.println("\n--- Menu ---");
			System.out.println("1. Adicionar produto");
			System.out.println("2. Remover produto");
			System.out.println("3. Ver carrinho");
			System.out.println("4. Finalizar compra");
			System.out.println("Escolha uma opção: ");
			String opcao = sc.nextLine();
			
			switch (opcao) {
			case "1":
				System.out.println("Digite o código do produto (001, 002, 003): ");
				String codigoAdd = sc.nextLine();
				
				Produto produtoSelecionado = null;
				if (codigoAdd.equals("001")) produtoSelecionado = p1;
				else if (codigoAdd.equals("002")) produtoSelecionado = p2;
				else if (codigoAdd.equals("003")) produtoSelecionado = p3;
				
				if (produtoSelecionado != null) {
					System.out.println("Digite a quantidade: ");
					int qdt = Integer.parseInt(sc.nextLine());
					carrinho.adicionarProduto(produtoSelecionado, qdt);
				} else {
					System.out.println("Produto não encontrado.");
				}
				break;
			case "2":
				System.out.println("Digite o código do produto para remover: ");
				String codigoRemover = sc.nextLine();
				carrinho.removerProduto(codigoRemover);
				break;
			case "3":
				System.out.println("\n--- Carrinho ---");
				carrinho.listarProdutos();
				System.out.printf("Total até agora: R$ %.2f\n", carrinho.calcularTotal());
				break;
			case "4":
				comprando = false;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
		System.out.println("\n--- Cupom Fiscal ---");
		carrinho.listarProdutos();
		System.out.printf("Total: R$ %.2f\n", carrinho.calcularTotal());
		
		sc.close();
	}

}
