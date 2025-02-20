package com.example.biblioteca.dto;

import com.example.biblioteca.entities.Livro;

public class LivroDTO {
	private Long id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public LivroDTO() {}

    public LivroDTO(Long id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public LivroDTO(Livro l) {
        id = l.getId();
        titulo = l.getTitulo();
        autor = l.getAutor();
        anoPublicacao = l.getAnoPublicacao();
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
}
