package com.semsa.model;

import java.util.Date;

public class UsuarioSus {

	private Long id;
	private String Nome;
	private String NomeMae;
	private String cpf;
	private Date dataNascimento;
	private String cns;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNomeMae() {
		return NomeMae;
	}
	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCns() {
		return cns;
	}
	public void setCns(String cns) {
		this.cns = cns;
	}
	
	@Override
	public String toString() {
		return "UsuarioSus [id=" + id + ", Nome=" + Nome + ", NomeMae=" + NomeMae + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", cns=" + cns + "]";
	}
	
	
	
	
}
