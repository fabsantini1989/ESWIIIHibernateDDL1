package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@Column(name = "codigo")
	@NotNull
	private int codigo;

	@Column(name = "nome_medico", length = 100)
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

	@Column(name = "contato", length = 11)
	@NotNull
	private String contato;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero_end(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep_end(String cep) {
		this.cep = cep;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Medico [codigo: " + codigo + ", nome: " + nome + ", logradouro: " + logradouro + ", numero: " + numero + ", cep: " + cep + ", contato: " + contato + "]";
	}

}
