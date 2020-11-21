/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.java.projeto.model;

/**
 *
 * @author fabricio
 */
public class Carro {
    
        private Integer id;
	private String placa;
	private String nome;

	public Carro() {
	}

	public Carro(String placa, String nome) {
		this.placa = placa;
		this.nome = nome;
	}

	public Carro(Integer id, String placa, String nome) {
		this.id = id;
		this.placa = placa;
		this.nome = nome;
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
		Carro other = (Carro) obj;
		return this.placa != null ? this.placa.equals(other.getPlaca()) : false;
	}

        	@Override
	public String toString() {
		return "Carro [id=" + id + ", placa=" + placa + ", nome=" + nome + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
