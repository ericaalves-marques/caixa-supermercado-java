package br.com.caixa;

public class Produto {
	private String nome;
	private String codigo;
	private double preco;
	
	public Produto(String nome, String codigo, double preco) {
		this.nome =nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return nome + " - R$ " + preco;
	}
}
