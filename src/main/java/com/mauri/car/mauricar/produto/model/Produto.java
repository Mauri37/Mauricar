package com.mauri.car.mauricar.produto.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private String descricao;

	private Double preco;

	@Temporal(TemporalType.DATE)
	private Calendar dataInicioVenda;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Calendar getDataInicioVenda() {
		return dataInicioVenda;
	}

	public void setDataInicioVenda(Calendar dataInicioVenda) {
		this.dataInicioVenda = dataInicioVenda;
	}

	public void lista() {
		// TODO Auto-generated method stub
		
	}

	// getters e setters

}
