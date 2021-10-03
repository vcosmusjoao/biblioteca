package br.com.letscode.java.biblioteca.livro;

import java.util.ArrayList;
import java.util.List;

public class CadastrarLivro {
    private final List<Livro> livros= new ArrayList<>();

    public void adcionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public List<Livro> listarLivros(){
        return this.livros;
    }
}
