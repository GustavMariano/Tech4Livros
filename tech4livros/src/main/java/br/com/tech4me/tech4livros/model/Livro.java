package br.com.tech4me.tech4livros.model;
//Atributos:
//nome, autor, codigo, valor, numeroPagina

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("livros")
public class Livro {

    @Id
    private String id;
    private String nome;
    private String autor;
    private Integer codigo;
    private double valor;
    private Integer numeroPagina;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Integer getNumeroPagina() {
        return numeroPagina;
    }
    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", codigo=" + codigo + ", id=" + id + ", nome=" + nome + ", numeroPagina="
                + numeroPagina + ", valor=" + valor + "]";
    }
    
}
