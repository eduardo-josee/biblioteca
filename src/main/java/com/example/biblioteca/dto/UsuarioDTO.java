package com.example.biblioteca.dto;

import com.example.biblioteca.entities.Usuario;

public class UsuarioDTO {
	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO(Long id, String nome, String email) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public UsuarioDTO(Usuario u) {
		
		id = u.getId();
		nome = u.getNome();
		email = u.getEmail();
	}
	public UsuarioDTO() {
		 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
