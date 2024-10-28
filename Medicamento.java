package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table

public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	
	@NotNull
	@Size(min=3,message = "minimo de 3 caracteres")
	private String nome;
	
	@NotNull
	@Size(min=100, message = "minimo de 100 caracteres")
	private String bula;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFornecedor;
	
	@NotNull
	@Size(max=8, message = "máximo de 8 caracteres+")
	private String dataValidade;
	
	//metodos getts e setts
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id) {
		this.id = id;
	}
	
	public String getBula() {
		return bula;
	}
	
	public void setBula(String bula) {
		this.bula = bula;
	}
	
	public int getidFornecedor() {
		return idFornecedor;
	}
	public void setidFornecedor (int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	
	public String getdataValidade() {
		return dataValidade;
	}
	
	public void setdataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
}
