package br.com.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto {

	private String nome;
	private double preco;
	private Long id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
