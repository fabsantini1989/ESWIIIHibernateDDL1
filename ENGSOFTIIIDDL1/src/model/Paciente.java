package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Column(name = "nome_paciente", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "logradouro", length = 100)
	@NotNull
	private String logradouro;
	
	@Column(name = "numero")
	@NotNull
	private int numero;
	
	@Column(name = "cep", length = 8)
	@NotNull
	private String cep;
	
	@Column(name = "tel", length = 11)
	@NotNull
	private String tel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro_end(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Paciente [nome: " + nome + ", logradouro: " + logradouro + ", numero: " + numero + ", cep: " + cep + ", tel: " + tel + "]";
	}

}
