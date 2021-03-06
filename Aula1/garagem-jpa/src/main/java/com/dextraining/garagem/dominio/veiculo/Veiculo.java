package com.dextraining.garagem.dominio.veiculo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Adicionar anotacoes do JPA na classe

@Entity
public class Veiculo {

	// TODO: Adicionar chave primaria
	// TODO: Adicionar anotacoes do JPA nos atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(length = 50,nullable=false)
	private String marca;
	@Column(length = 50, nullable=false)
	private String modelo;
	@Column(nullable=false)
	private String placa;
	@Column(nullable=false)
	private int ano;
	@Column(nullable=false)
	private Double preco;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String placa, int ano, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco="
				+ preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
}
