package br.com.tech4me.tech4livros.service;

import java.util.List;

import br.com.tech4me.tech4livros.model.Livro;

public interface LivroService {
    List<Livro> obterLivros();
    Livro cadastrarLivro(Livro livro);
    Livro obterLivroPorId(String id);
    void excluirLivro(String id);
    Livro atualizarLivro(String id, Livro novoLivro);
    
}
