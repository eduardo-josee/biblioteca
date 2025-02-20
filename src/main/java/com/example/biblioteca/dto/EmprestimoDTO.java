package com.example.biblioteca.dto;

import java.time.Instant;

import com.example.biblioteca.entities.Emprestimo;

public class EmprestimoDTO {
	private Long id;
	private Instant dataEmprestimo;
	private Instant dataDevolucao;
	public EmprestimoDTO(Long id, Instant dataEmprestimo, Instant dataDevolucao) {
		 
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	public EmprestimoDTO(Emprestimo e) {
		 
		id = e.getId();
		dataEmprestimo = e.getDataEmprestimo();
		dataDevolucao = e.getDataDevolucao();
	}
	public EmprestimoDTO() {
		 
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
