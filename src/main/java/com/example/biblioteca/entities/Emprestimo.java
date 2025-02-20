package com.example.biblioteca.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant dataEmprestimo;
	private Instant dataDevolucao;
	
	@ManyToOne
	private Livro livro;
	
	@ManyToOne
	private Usuario usuario;
	
	public Emprestimo(Long id, Instant dataEmprestimo, Instant dataDevolucao) {
		 
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	public Emprestimo() {
		 
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Instant dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Instant getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Instant dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
}
