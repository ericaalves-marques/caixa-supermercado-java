package br.com.caixa;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }
    public void removerProduto(String codigo) {
    	itens.removeIf(item -> item.getProduto().getCodigo().equals(codigo));
    }

    public void listarProdutos() {
        for (ItemCarrinho item : itens) {
            System.out.println(item);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
}
